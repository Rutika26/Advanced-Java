<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2>Student registered successfully</h1>
<h2>Name is ${student.name }</h2>
<h2>Student Id is ${student.id }</h2>

<h2>Courses is ${student.courses }</h2>
<h2>Student gender is ${student.gender }</h2>
<h2>Student type is ${student.type }</h2>
<hr>
<h2>Address Street is ${student.address.street }</h2>
<h2>Address City is ${student.address.city }</h2>

</body>
</html>