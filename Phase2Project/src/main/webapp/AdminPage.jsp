<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body >
<br>
<a href=index.jsp>Back To Main Page</a>
<br><br>
<center>
<h2>Admin Login</h2>

<form action=AdminLogin method="post">

	<label>Email :-</label>
	<input type="email" name="email" /><br><br>
	
	<label >Password :-</label>
	<input type="password" name="password" /><br><br>
	
	<input type=submit value=Login />
	<input type=reset />
</form>

<br>

<a href=ForgotPassword.jsp style="font-size:25;color:red;">Change the Password</a>

<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:red;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
<br>
</body>
</html>