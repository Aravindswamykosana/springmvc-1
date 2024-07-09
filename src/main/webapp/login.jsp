<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String msg=(String)request.getAttribute("msg"); 
if(msg!=null){%>
<%=msg %>
<%} %>
<% String msg1=(String)request.getAttribute("msg1");
if(msg1!=null){%>
<%=msg1 %>
<%} %>

<fieldset>
<legend>Login-form</legend>
<form action="login">
Email:<input type="email" placeholder="enter your email" name="email"><br><br>
Pwd:<input type="password" placeholder="enter your pwd" name="pwd"><br><br>
<button>Login</button>
</form>
</fieldset>
</body>
</html>