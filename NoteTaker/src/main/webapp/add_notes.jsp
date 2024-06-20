<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add notes</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
	<%@include file="navbar.jsp" %>
	
	<!-- this is add form -->
	<form action="SaveNoteServlet" method="post">
	
 <div class="container">
 <h1>Please fill your details</h1><br>
  <div class="form-group">
    <label for="title">Note Title</label>
    <input required type="text"
    	   name="title" 
           class="form-control" id="title" 
           aria-describedby="emailHelp" 
           placeholder="Enter here">
      </div>
      
  <div class="form-group">
    <label for="content">Note Content</label>
    <textarea required id="content" 
    		  name="content"
    		  placeholder="Enter your content here" 
    		  class="form-control" 
    		  style="height:300px"></textarea>
     </div>
 	<div class="container text-center">
 	 <button type="submit" class="btn btn-primary">Add</button>
 	</div>
 
 </div>
</form>
</body>
</html>