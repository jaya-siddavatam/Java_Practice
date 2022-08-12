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
<h2>View All Student Details</h2>
<table border="1">
	<tr>
		<th>SId</th>
		<th>SName</th>
		<th>Age</th>
	</tr>
	<core:forEach items="${sessionScope.listofstudent}" var="s">
		<tr>
			<td> <core:out value="${s.sid}"></core:out> </td>
			<td> <core:out value="${s.sname}"></core:out> </td>
			<td> <core:out value="${s.age}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="Homr.jsp">Main</a>
</body>
</html>