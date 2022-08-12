<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String stdName; %>
<%
Object obj = session.getAttribute("obj"); // at first we didnot store any obj in session scope
List<String> listofstd;
if(obj==null){   //at first call
	listofstd = new ArrayList<String>(); //create a new memory
	stdName = request.getParameter("stdName"); //get name from std.jsp
	listofstd.add(stdName); //we add that name to listofstd list
	session.setAttribute("obj", listofstd); //and that listofstd we are storing in session object
}else {  //at 2nd call else part will execute
	stdName = request.getParameter("stdName"); //from std.jsp
	listofstd = (List<String>)session.getAttribute("obj"); // we are getting the list of objects in the session scope and converting into string array and storing it into listofstd 
	listofstd.add(stdName);//adding the  new name to list
	
	for(String s:listofstd){
		out.println("Name is "+s+"<br>");
	}
}
%>
<%@include file="std.jsp" %>

</body>
</html>