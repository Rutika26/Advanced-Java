<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

	<h1>This is help page</h1>
	
	<h2>Hello my name is ${name}</h2>
	<h2>Roll no is ${rollNo}</h2>
	<h3>date and time ${time}</h3><hr>
	<c:forEach var="item" items="${marks}">
		<h3>${item }</h3>
	</c:forEach>
	
</body>
</html>