package com.damac.utils;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ApachePOIExcelRead {

    

    public static Sheet getSheet(String FILE_NAME) { 
    	 Sheet datatypeSheet = null;
        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            datatypeSheet = workbook.getSheetAt(0);
//            Iterator<Row> iterator = datatypeSheet.iterator();

//            while (iterator.hasNext()) {
//
//                Row currentRow = iterator.next();
//                Iterator<Cell> cellIterator = currentRow.iterator();
//
//                while (cellIterator.hasNext()) {
//
//                    Cell currentCell = cellIterator.next();
//                    //getCellTypeEnum shown as deprecated for version 3.15
//                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
//                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
//                        System.out.print(currentCell.getStringCellValue() + "--");
//                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
//                        System.out.print(currentCell.getNumericCellValue() + "--");
//                    }
//
//                }
//                System.out.println();
//
//            }
                   } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datatypeSheet;

    }
    public static Workbook getBook(String FILE_NAME) { 
    	Workbook workbook = null;
       try {

           FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
           workbook = new XSSFWorkbook(excelFile);
           
//           Iterator<Row> iterator = datatypeSheet.iterator();

//           while (iterator.hasNext()) {
//
//               Row currentRow = iterator.next();
//               Iterator<Cell> cellIterator = currentRow.iterator();
//
//               while (cellIterator.hasNext()) {
//
//                   Cell currentCell = cellIterator.next();
//                   //getCellTypeEnum shown as deprecated for version 3.15
//                   //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
//                   if (currentCell.getCellTypeEnum() == CellType.STRING) {
//                       System.out.print(currentCell.getStringCellValue() + "--");
//                   } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
//                       System.out.print(currentCell.getNumericCellValue() + "--");
//                   }
//
//               }
//               System.out.println();
//
//           }
                  } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return workbook;

   }
    public static boolean isRowEmpty(Row row) {
		for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
			Cell cell = row.getCell(c);
			if (cell != null && cell.getCellTypeEnum() != CellType.BLANK)
				return false;
		}
		return true;
	}
}