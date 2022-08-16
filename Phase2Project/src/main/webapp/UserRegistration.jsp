<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Page</title>
</head>
<body>
<center>
<br>
<h1>FlyAway User Registration</h1>
<br><br>
<form action=Registration method= "post">
    <label >Name      :-</label> 
    <input type="text" name= "name" /><br><br>
    <label >Phone No. :-</label> 
    <input type="text" name= "phno" /><br><br>
	<label >Email     :-</label> 
	<input type="email" name="email" /><br><br>
	<label>Password   :-</label> 
	<input type="password" name= "password" /><br><br>
	
	<input type=submit value=submit /> 
	<input type=reset />
</form>
</body>
</html>