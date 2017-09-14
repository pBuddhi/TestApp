package com.damac.servlets;
import java.io.*;
import java.util.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;

import com.damac.test.TestAopt;
import com.damac.test.TestAopt1;
import com.damac.test.TestAssignment;
import com.damac.test.TestAssignment1;
import com.damac.test.TestCocd;
import com.damac.test.TestCocd1;


//public class UploadServlet extends HttpServlet {
//   
//   /**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//private boolean isMultipart;
//   private String filePath;
//   private int maxFileSize = 50 * 1024;
//   private int maxMemSize = 4 * 1024;
//   private File file ;
//   @Override
//   public void init( ){
//      // Get the file location where it would be stored.
//      filePath = getServletContext().getInitParameter("file-upload"); 
//   }
//   @Override
//   public void doPost(HttpServletRequest request, HttpServletResponse response)
//      throws ServletException, java.io.IOException {
////	   java.io.PrintWriter out = response.getWriter( );
////	   out.println("hello");
////	   out.print("hhhh");
////      // Check that we have a file upload request
//      isMultipart = ServletFileUpload.isMultipartContent(request);
//      response.setContentType("text/html");
//      java.io.PrintWriter out = response.getWriter( );
//      out.println("started");
//      if( !isMultipart ) {
//    	 
//         out.println("<html>");
//         out.println("<head>");
//         out.println("<title>Servlet upload</title>");  
//         out.println("</head>");
//         out.println("<body>");
//         out.println("<p>No file uploaded</p>"); 
//         out.println("</body>");
//         out.println("</html>");
//         return;
//      }
//      out.println("after if");
//      DiskFileItemFactory factory = new DiskFileItemFactory();
//   
//      // maximum size that will be stored in memory
//      factory.setSizeThreshold(maxMemSize);
//   
//      // Location to save data that is larger than maxMemSize.
//      factory.setRepository(new File("c:\\temp"));
//
//      // Create a new file upload handler
//      ServletFileUpload upload = new ServletFileUpload(factory);
//   
//      // maximum file size to be uploaded.
//      upload.setSizeMax( maxFileSize );
//
//      try { 
//         // Parse the request to get file items.
//    	 out.println("in try");
//         List fileItems = upload.parseRequest(request);
//	
//         // Process the uploaded file items
//         Iterator i = fileItems.iterator();
//
//         out.println("<html>");
//         out.println("<head>");
//         out.println("<title>Servlet upload</title>");  
//         out.println("</head>");
//         out.println("<body>");
//   
//         while ( i.hasNext () ) {
//        	out.println("in while");
//            FileItem fi = (FileItem)i.next();
//            if ( !fi.isFormField () ) {
//               // Get the uploaded file parameters
//               String fieldName = fi.getFieldName();
//               String fileName = fi.getName();
//               String contentType = fi.getContentType();
//               boolean isInMemory = fi.isInMemory();
//               long sizeInBytes = fi.getSize();
//            
//               // Write the file
//               if( fileName.lastIndexOf("\\") >= 0 ) {
//                  file = new File( filePath + fileName.substring( fileName.lastIndexOf("\\"))) ;
//               } else {
//                  file = new File( filePath + fileName.substring(fileName.lastIndexOf("\\")+1)) ;
//               }
//               fi.write( file ) ;
//               out.println("Uploaded Filename: " + fileName + "<br>");
//            }
//         }
//         out.println("</body>");
//         out.println("</html>");
//         } catch(Exception ex) {
//            System.out.println(ex);
//         }
//	   
//      }
//      @Override
//      public void doGet(HttpServletRequest request, HttpServletResponse response)
//         throws ServletException, java.io.IOException {
//
//         throw new ServletException("GET method used with class " +
//            getClass( ).getName( )+": POST method required.");
//      }
//   }
@MultipartConfig(fileSizeThreshold=1024*1024*2, maxFileSize=1024*1024*10,maxRequestSize=1024*1024*50)
public class UploadServlet1 extends HttpServlet {
	/**
	 * Name of the directory where uploaded files will be saved, relative to
	 * the web application directory.
	 */
	//private static final String SAVE_DIR = "uploadFiles";

	/**
	 * handles file upload
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// gets absolute path of the web application
		//String appPath = request.getServletContext().getRealPath("");
		// constructs path of the directory to save uploaded file
		//        String savePath = appPath + File.separator + SAVE_DIR;
		String savePath = "D:\\data";
		// creates the save directory if it does not exists
		File fileSaveDir = new File(savePath);
		if (!fileSaveDir.exists()) {
			fileSaveDir.mkdir();
		}
		String fileName = null;
		for (Part part : request.getParts()) {
			fileName = extractFileName(part);
			// refines the fileName in case it is an absolute path
			fileName = new File(fileName).getName();
			part.write(savePath + File.separator + fileName);
		}
		//request.setAttribute("message", "Upload has been done successfully!");
		String processName = fileName.substring(0,fileName.indexOf("_"));
		String fileOutName = null;
		try{
			if(processName.toLowerCase().equals("aopt")){
				fileOutName = "aopt_tests_out_demo.xlsx";
				TestAopt1.test(savePath+File.separator + fileName);
			}
			else if(processName.toLowerCase().equals("cocd")){
				fileOutName = "cocd_tests_out_demo.xlsx";
				TestCocd1.test(savePath+File.separator + fileName);
			}
			else if(processName.toLowerCase().equals("assignment")){
				fileOutName = "assignment_tests_out_demo.xlsx";
				TestAssignment1.test(savePath+File.separator + fileName);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		request.setAttribute("fileName", fileName);

		request.getRequestDispatcher("/message.jsp").forward(request, response);
		//        getServletContext().getRequestDispatcher("/message.jsp").forward(
		//                request, response);
	}
	/**
	 * Extracts file name from HTTP header content-disposition
	 */
	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length()-1);
			}
		}
		return "";
	}
}
