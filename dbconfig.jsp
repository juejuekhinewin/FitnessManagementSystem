<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>
<% 
Class.forName("com.mysql.cj.jdbc.Driver");
%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/jpeg" href="icon.jpeg">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<% 	        
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/fitnessdb","root","");
%>
</body>
</html>