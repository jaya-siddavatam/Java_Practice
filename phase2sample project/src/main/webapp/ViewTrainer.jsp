<%@page import="java.util.Iterator"%>
<%@page import="com.java.Trainer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
    <th>TID</th>
    <th>TName</th>
    <th>Tech</th>
</tr>
<%
Object obj = session.getAttribute("listoftrainer"); //it is in object format
List<Trainer> listOfTrainer = (List<Trainer>) obj; // typecaste to list of trainer
Iterator<Trainer> li = listOfTrainer.iterator();
while(li.hasNext()){
    Trainer t = li.next();
    %>
    <tr>
    <td><%=t.getTid() %> </td>
    <td><%=t.getTname()%> </td>
    <td><%=t.getTech() %></td>
    </tr>
    <% 
}
%>
</table>
<br/>
<h2>Display Trainer records using JSTL</h2>
<table border="1">
	<tr>
	<th>TID</th>
	<th>TName</th>
	<th>Tech</th>
	</tr>
<core:forEach items="${sessionScope.listoftrainer}" var="t">
	<tr>
		<td><core:out value="${t.tid}"></core:out> </td>
		<td><core:out value="${t.tname}"></core:out> </td>
		<td><core:out value="${t.tech}"></core:out> </td>
	</tr>
</core:forEach>
</table>
<a href="Homr.jsp">Go to Main page </a>
</body>
</html>