package com.damac.servlets;
import java.io.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  

public class DownloadServlet extends HttpServlet {  

	public void doGet(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {  
		
		
		
		final String SAVE_DIR = "uploadFiles";
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		String filename = "aopt_tests_out.xlsx";   
		String filepath = request.getServletContext().getRealPath("")+ File.separator + SAVE_DIR;   
		response.setContentType("application/vnd.ms-excel");   
		response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   

		FileInputStream fileInputStream = new FileInputStream(filepath +File.separator+ filename);  

		int i;   
		while ((i=fileInputStream.read()) != -1) {  
			out.write(i);   
		}   
		fileInputStream.close();   
		out.close();   
//		 File my_file = new File(filepath +File.separator+ filename);
//
//         // This should send the file to browser
//         OutputStream out = response.getOutputStream();
//         FileInputStream in = new FileInputStream(my_file);
//         byte[] buffer = new byte[4096];
//         int length;
//         while ((length = in.read(buffer)) > 0){                                
//            out.write(buffer, 0, length);
//         }
//         in.close();
//         out.flush();
	}  
	 @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {

                         String filename = request.getParameter("fileName");
                         
                         
                 		response.setContentType("text/html");  
                 		
                 		PrintWriter out = response.getWriter();  
                 		//String filename = "aopt_tests_out.xlsx";   
                 		String filepath = "D:\\data";//request.getServletContext().getRealPath("")+ File.separator + SAVE_DIR;   
                 		response.setContentType("application/vnd.ms-excel");   
                 		response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   

                 		FileInputStream fileInputStream = new FileInputStream(filepath +File.separator+ filename);  

                 		int i;   
                 		while ((i=fileInputStream.read()) != -1) {  
                 			out.write(i);   
                 		}   
                 		fileInputStream.close();   
                 		out.close();   
         }


}