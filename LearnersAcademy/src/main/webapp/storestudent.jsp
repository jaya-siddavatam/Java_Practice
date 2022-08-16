<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Add Student Details</h2>
<form action="StudentController" method="post">
<label>StudentId</label>
<input type="number" name="sid"><br/>
<label>StudentName</label>
<input type="text" name="sname"><br/>

<input type="submit" value="Store Student">
<input type="reset" value="Reset">
</form>
<br/>
<a href="home.jsp">Back to Main page</a>


</body>
</html>