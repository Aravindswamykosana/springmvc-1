<%@page import="springmvc_1.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Employee> li=(List)request.getAttribute("emp");
for(Employee l:li){%>
<%=l %>
<%} %>
</body>
</html>