<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="p" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>products</title>
</head>
<body>
<h1>Product Details</h1>
<table>
<tr>
	<th>Product ID</th>
	<th>Product Name</th>
	<th>Product Price</th>
</tr>
<p:forEach var="pro" items="${ProductDetails}" >
<tr>
	<td>${pro.pid}  </td>
	<td>${pro.pname} </td>
	<td>${pro.pcost} </td>
</tr>
</p:forEach>
</table>
<br>
<%
%>
<%@include file="index.jsp" %>
</body>
</html>