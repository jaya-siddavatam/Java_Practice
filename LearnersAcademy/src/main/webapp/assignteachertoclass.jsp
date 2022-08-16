<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Assign  Teacher to Class</h2>
<form action="AssignTeacherToClass" method="post">
<label>TeacherId</label>
<input type="number" name="tid"><br/>
<label>ClassId</label>
<input type="number" name="cid"><br/>

<input type="submit" value="Assign">
<input type="reset" value="Reset">
</form>
<br/>
<a href="home.jsp">Back to Main page</a>

</body>
</html>