<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home Page</title>
</head>
<body >
<br>
<a href=index.jsp>Back to Main Page</a>
<br><br>
<center>
<h1>FlyAway</h1><br><br>
<h2>Enter New Flight Details</h2>

<form action=InsertFlight method= "post">
	<label >Name of Flight:-</label> 
	<input type="text" name="name"  /><br><br>
	<label >From :-</label> 
	<input type="text" name="from"  /><br><br>
	<label >To :-</label>
	<input type="text" name= "to"  /><br><br>
	<label >Departure On :-</label>
	<input type="date" name= "departure"  /><br><br>
	<label >Time :-</label> 
	<input type="time" name= "time"  /><br><br>
	<label >Price :-</label>
	<input type="text" name= "price"  /><br><br>
	
	
	<input type=submit value=submit /> <input type=reset />
</form>

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