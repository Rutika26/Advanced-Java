<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h1>${Header }</h1>
<h1 style="color:green">${msg }</h1>
<p>${desc }</p>
<!-- 
	******Using @RequestParam annotation***********
	<h1> Welcome, ${name}</h1>
	<h2>Your email address is ${email }</h2>
	<h2>Your password is ${password }</h2>

 -->


<!-- ********@ModelAttribute annotation ********** -->
	<h1> Welcome, ${user.userName}</h1>
	<h2>Your email address is ${user.userEmail }</h2>
	<h2>Your password is ${user.userPassword }</h2>
</body>
</html>