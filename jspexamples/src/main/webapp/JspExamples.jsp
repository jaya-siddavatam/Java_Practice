<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to HTML Web Page</h3>
<%-- In JSP Comment tag --%>
<%!int a,b,product; 
//instance variable declaration
%>

<%
//int a = 20;
//int b = 30;
//int product = a*b;
a = 20;
b =40;
product = a*b;
out.println("Welcome to JSP<br>");
out.println("\n Product of two numbers is "+product);
%>
<br>
<p>Product of two numbers is <%=10*20 %> </p>
<p>Product of two numbers is <%=product %> </p>
<font color = "blue">Product of two <%=a%> and <%=b%> is <%=product %></font>
</body>
</html>