<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page  import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Booking Portal</title>
</head>
<body>
<br>
<a href=Home.jsp >Click Here to Change the Booking Details</a>
<br><br>

<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	if(user==null){
		response.sendRedirect("UserRegistration.jsp");
	}
%>
<br><br>
<a href="Payment.jsp"><button> Proceed to Pay</a></button>

</body>
</html>