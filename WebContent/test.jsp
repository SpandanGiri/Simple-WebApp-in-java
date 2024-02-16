<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "src.main.java.com.robin.Dbtools.java"
%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "lightblue">
	<%
		String username = request.getParameter("fname");
		
		out.println("JSP says Hi  " + username);
	
	%>
</body>
</html>