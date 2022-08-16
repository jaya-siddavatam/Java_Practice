<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Home Page   ${sessionScope.obj}</h2>
<br>

<a href="storeteacher.jsp">Add Teacher Details</a> |
<a href="storestudent.jsp">Add Student Details</a> |
<a href="storeclass.jsp">Add class Details</a>     |
<a href="storesubject.jsp">Add Subject Details</a> |

<br>
<br>
<a href ="assignstudenttoclass.jsp">Assign Student to Class</a>     |
<a href ="assignteachertosubject.jsp">Assign teacher to subject</a> |
<a href ="assignteachertoclass.jsp">Assign Teacher to Class</a>     |
<a href ="assignsubjecttoclass.jsp">Assign Subject to Class </a>    |
<br>
<br>
<a href ="viewteachers.jsp">View List Of Teachers</a> |

</body>
</html>