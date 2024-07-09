<%@page import="springmvc_1.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Employee emp=(Employee)request.getAttribute("print");
if(emp!=null){ %>
	Id:<%=emp.getId() %><br>
	Name:<%=emp.getName()%>
	<br> Email:<%=emp.getEmail()%>
	<br> Pwd:<%=emp.getPwd()%><br> 
	phone:<%=emp.getPhone()%><br>
	sal :<%=emp.getSal()%><br> 
<%} %>
</body>
</html>