<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<h2>Welcome to Home Page ${sessionScope.obj}</h2>

<%
//String name = (String) session.getAttribute("obj");
//out.println(name);
%>
<a href="storetrainer.jsp">Add Trainer Details</a> |
<a href="storeStudent.jsp">Add Student Details</a> |
<a href ="TrainerController">View all trainer details</a> |
<a href ="StudentController">View all student details</a> |
</body>
</html>