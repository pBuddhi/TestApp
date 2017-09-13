<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload</title>
</head>
<body>
	<%-- <%= request.getAttribute("message") %>.
	<h2>${message}</h2>
	<a href="DownloadServlet">download the jsp file</a> --%>
	<% String fileName =  (String)request.getAttribute("fileName"); %>
	<%= fileName%>
	<form method="Post" action="DownloadServlet">
		<!-- <input type="text" name="username" />
        <input type="password" name="password" /> -->
		 <input type="hidden" name="fileName" value="<%=fileName%>" /> <input
			type='submit' value="Download" />
	</form>
</body>
</html>