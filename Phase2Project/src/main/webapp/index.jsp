<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body >
<center>
<br>
<h1>Fly Away</h1>
<br><br>
<h2>Enter Your Details to Login</h2>

<form action=LoginDetails method=post >
<table >
    <tr>
    <td><label >Email</label><br></td>
    <td><input type="email" name= "email" /></td>
    </tr>
    <tr>
    <td><label >Password</label><br></td>
    <td><input type="password" name="password" /></td>
    </tr>
    
    <tr>
    <td><input type=submit value=submit /></td>
    <td><input type=reset /></td>
    </tr>
    </table>
	
</form>

<br><br>
<h3>New User Create an account</h3>
<h4><a href=UserRegistration.jsp style="font-size:25;color:red;">Create Account</a></h4>

<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:red;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
</body>
</html>