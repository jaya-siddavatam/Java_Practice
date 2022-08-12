<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import ="java.sql.*" 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String emailid ,password;

%>
<%
emailid = request.getParameter("email");
password = request.getParameter("password");

//RequestDispatcher rd1 = request.getRequestDispatcher("home.jsp");
//RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
if(emailid.equals("jaya@gmail.com") && password.equals("1234")){
  out.println("Successfully LOgin");
  //rd1.forward(request ,response);
  request.setAttribute("obj", emailid);

  %>
  <jsp:forward page="home.jsp"></jsp:forward>
  
  <%
}
  else{
	  out.println("Failure Try once again");
	  //rd2.include(request,response);
	  %>
	  <%-- we have to use include and forward in outside the scriplet tag --%>
	  <jsp:include page="login.jsp"></jsp:include> 
	  <% 
  }
%>
</body>
</html>