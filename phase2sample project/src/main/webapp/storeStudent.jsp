<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h2>Add Trainer Details</h2>
<form action="StudentController" method="post">
<label>SId</label>
<input type="number" name="sid"><br/>
<label>SName</label>
<input type="text" name="sname"><br/>
<label>Age</label>
<input type="number" name="age"><br/>
<input type="submit" value="Store Student">
<input type="reset" value="reset">
</form>
<br/>
<a href="Homr.jsp">Back to Main Page</a>

</body>
</html>