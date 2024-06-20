
<%@ page import="org.hibernate.Query"%>
<%@ page import="com.helper.FactoryProvider"%>
<%@ page import="org.hibernate.Session"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.entities.Note" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>All notes : Note taker</title>
	<%@include file="all_js_css.jsp" %>
	<style>
		thead{
			font-weight:bolder;
			text-transform: uppercase;
		}
		table,td,tr{
			border:2px solid black;
			padding:5px;
			margin:30px;
		
		}
	</style>
</head>
<body>
<%@include file="navbar.jsp" %>
<br>
<div class="container">
<h1 class="text-uppercase">All Notes : </h1>


<div class="row">
<div class="col-12">

<%
	Session s = FactoryProvider.getFactory().openSession();

	Query q = s.createQuery("from Note");	
	List<Note> list1 = new ArrayList<Note>();
	list1 = q.list();
	
	for(Note note:list1){
%>
	<div class="card mt-3">
	  	<img class="card-img-top m-4 mx-auto" 
	  	   src="img/noteicon.png" 
	  	   alt="Card image cap"
	  	   style="max-width:70px">
	  	<div class="card-body px-5">
		    <h5 class="card-title"><%= note.getTitle() %></h5>
		    <p class="card-text"><%= note.getContent() %><br>
		    					<b class="text-primary">Last Updated : <%= note.getAddedDate() %></b>
		    </p>
		    <div class="container text-center mt-2">
		    	<a href="edit.jsp?note_id=<%= note.getId() %>" class="btn btn-primary">Update</a>
		    	<a href="DeleteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a>
		    </div>
  		</div>
  </div>
	<%
		}
		s.close();
	%>


</div>

</div>
</div>
</body>
</html>