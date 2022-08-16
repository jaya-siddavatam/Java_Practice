<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>


<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	
if(user!=null){
%>

<h1>Welcome <%=user.get("name") %></h1>

<a href="LogoutDetails">Logout  </a>
<%
	}else{
%>
<a href=index.jsp> Back to User Login </a>
<%
	}
%>
<br><br>
<center>
<h1>FlyAway</h1>
<form action=FlightList method=post>
	<label >From :-</label>
	<input type=text name="from" /><br><br>
	<label >To :-</label> 
	<input type=text name= "to" /><br><br>
	<label >Departure :-</label> 
	<input type=date name="departure" /><br><br>
	
	<input type=submit value=Search /> 
	<input type=reset />
</form>
<br><br>
<a href="AdminPage.jsp">Admin</a>
</body>
</html>