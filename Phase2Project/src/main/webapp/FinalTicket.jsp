<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page  import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Ticket</title>
</head>
<body>
<body>
<a href=Home.jsp>Click Here to Book Another Ticket</a>
<h1 style="color:green">Booking done successfully..Happy Journey!!</h1>
<form>

<%
	@SuppressWarnings("unchecked") 
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
%>

<h1 style="color:blue;">Thank you <%=user.get("name")%> for using FlyAway!!</h1>
<h1>Your Airplane Ticket</h1>
<%
	@SuppressWarnings("unchecked")
	List<String[]> flights=(List<String[]>)session.getAttribute("flights");
%>

<table border="1">
<tr>
    <th>PassengerName</th>
	<th>FlightName</th>
	<th>DepartureTime</th>
	<th>Price</th>
</tr>
<%
	for(String[] flight:flights){
%>
<tr>
<td><%=user.get("name")%>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>
<td><%=flight[2]%></td>
</tr>
</table>
<%
	}
%>	
</form>
</body>
</html>