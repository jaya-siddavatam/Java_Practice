<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProductDetails" method = "post">
   <label>ProductID</label>
   <input type ="text" name ="pid"><br>
   <label>ProductName</label>
   <input type ="text" name ="pname"><br>
   <label>ProductPrice</label>
   <input type ="number" name ="pcost"><br>
   
   <input type="submit" value="submit">
   <input type="reset" value="reset">
</form> 
</body>
</html>