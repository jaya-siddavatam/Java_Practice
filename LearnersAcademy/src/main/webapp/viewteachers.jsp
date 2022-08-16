<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>View All Teacher Details</h2>
<table border="1">
	<tr>
		<th>TId</th>
		<th>TName</th>	
	</tr>
	<core:forEach items="${sessionScope.listofteacher}" var="t">
		<tr>
			<td> <core:out value="${t.tid}"></core:out> </td>
			<td> <core:out value="${t.tname}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="home.jsp">Back to Main Page</a>
</body>
</html>