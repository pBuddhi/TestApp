package com.damac.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import javax.ws.rs.core.MediaType;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.damac.models.Aopt;
import com.damac.models.AoptApproval;
import com.damac.models.tere;
import com.damac.utils.ApachePOIExcelRead;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class TestAopt {
public static void test(String infile, String outfile) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, IOException {
	String REST_URI = tere.REST_URI;

	int noOfVars = 77;

	String FILE_NAME = infile;
	Workbook workbook = ApachePOIExcelRead.getBook(FILE_NAME);
	Sheet sheet = workbook.getSheetAt(0);//ApachePOIExcelRead.getSheet(FILE_NAME);
	Iterator<Row> iterator = sheet.iterator();

	String vars[] = new String[noOfVars];
	
	FileOutputStream outputStream = new FileOutputStream(outfile);
	
	
	int rowno = 0;
	while (iterator.hasNext()) {
		System.out.println(rowno++);
		Aopt data = new Aopt();
		Row currentRow = iterator.next();

		if (currentRow.getRowNum() == 0) {
			noOfVars = currentRow.getLastCellNum();
			for (int i = 1; i < noOfVars; i++) {
				Cell currentCell = currentRow.getCell(i);
				if(currentCell==null) continue;
				if (currentCell.getCellType() == Cell.CELL_TYPE_STRING) {

					vars[i] = currentCell.getStringCellValue();
					// System.out.println(vars[i]);
				} else if (currentCell.getCellType() == Cell.CELL_TYPE_BLANK) {
					// System.out.println(vars[i]);
					vars[i] = "";

				}
			}
			continue;
		}
		if (ApachePOIExcelRead.isRowEmpty(currentRow))
			break;

		int lastCellNum = 45;
		for (int cellIndex = 1; cellIndex < lastCellNum; cellIndex++) {

			Cell currentCell = currentRow.getCell(cellIndex);
			//// System.out.println(cellIndex);
			if(currentCell==null) continue;
			if (currentCell.getCellType() == Cell.CELL_TYPE_STRING) {
				//// System.out.println(vars[cellIndex])
				BeanUtils.setProperty(data, vars[cellIndex], currentCell.getStringCellValue());

			} else if (currentCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				// System.out.println("numeric "+vars[cellIndex]);
				Class datatype = PropertyUtils.getPropertyType(data, vars[cellIndex]);
				// // System.out.println(datatype.getName());
				if (datatype.getName() == "java.lang.Integer") {
					Integer it = Integer.valueOf((int) currentCell.getNumericCellValue());
					BeanUtils.setProperty(data, vars[cellIndex], it);
					// System.out.println(BeanUtils.getProperty(data,vars[cellIndex]));
				} else if (datatype.getName() == "java.lang.Double") {
					Double it = Double.valueOf((double) currentCell.getNumericCellValue());
					BeanUtils.setProperty(data, vars[cellIndex], it);
					// System.out.println(BeanUtils.getProperty(data,vars[cellIndex]));
				}
			}

		}

		AoptApproval result = null;

		try {
			
			Client client = Client.create();
			WebResource webResource = client.resource(REST_URI).path("approval").path("aopt");
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON).post(ClientResponse.class, data);
			if (response.getStatus() == 201) {
				result = response.getEntity(AoptApproval.class);
			} else {
				response.close();
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Cell lastcell = currentRow.createCell(currentRow.getLastCellNum());
		lastcell.setCellValue("PASSED");
		for (int cellIndex = lastCellNum; cellIndex < currentRow.getLastCellNum()-1; cellIndex++) {
			//// System.out.println(cellIndex);
			Cell currentCell = currentRow.getCell(cellIndex);
			// System.out.println(currentCell.getCellType());
			if (currentCell.getCellType() == Cell.CELL_TYPE_STRING) {

				// System.out.println(vars[cellIndex]);
				String property = BeanUtils.getProperty(result, vars[cellIndex]);
				 
				
//				Assert.assertTrue(currentCell.getStringCellValue().equals(property));
				if(!currentCell.getStringCellValue().equals(property)){
					System.out.println("Mismatch- " + property+" and "+currentCell.getStringCellValue());
					String cellVal = String.format("Failed in column: %d variable name : %s", cellIndex,vars[cellIndex]);
					lastcell.setCellValue(cellVal);
					break;
				}

			} else if (currentCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

				String property = BeanUtils.getProperty(result, vars[cellIndex]);
				
//				Assert.assertTrue(currentCell.getNumericCellValue() == Double.parseDouble(property));
				if(currentCell.getNumericCellValue() != Double.parseDouble(property)){
					System.out.println("Mismatch- " + property+" and "+currentCell.getNumericCellValue());
					String cellVal = String.format("Failed in column: %d variable name : %s", cellIndex,vars[cellIndex]);
					lastcell.setCellValue(cellVal);
					break;
				}
			}
			else{
				String property = BeanUtils.getProperty(result, vars[cellIndex]);
				//System.out.println(property + "and blank");
				if(property!=null && property!=""){
					System.out.println("Mismatch- " + property + " and blank cell in test case xls");
					String cellVal = String.format("Failed in column: %d variable name : %s", cellIndex,vars[cellIndex]);
					lastcell.setCellValue(cellVal);
					break;
				}
			}
		}
	}
	workbook.write(outputStream);
	workbook.close();
	outputStream.close();
	System.out.println("Done");
}
}
