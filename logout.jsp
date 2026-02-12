<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession ses= request.getSession();
    ses.invalidate();
    //response.sendRedirect("login.html");
    
    request.getRequestDispatcher("login.html").include(request,response);
%>

</body>
</html>