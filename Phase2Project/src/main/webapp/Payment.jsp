<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Details</title>
</head>
<body>

<form action=FlightList method="get">


    <label>Name on Card :-</label> 
    <input type="text" name="name" /><br><br>
    <label>Card Number  :-</label> 
    <input type="number" name="num" /><br><br>
	<label>CVV          :-</label> 
	<input type="number" name="num" /><br><br>
	
	<input type="submit" value="Make Payment"/>
	
</form>

</body>
</html>