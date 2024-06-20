<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.helper.FactoryProvider"%>
<%@ page import="org.hibernate.Session"%>
<%@ page import="org.hibernate.Transaction"%>
<%@ page import="com.entities.Note"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>

	<%@include file="navbar.jsp" %>
	<div class="container">
	<h1>Edit your note</h1>
		<%
		int noteId = Integer.parseInt(request.getParameter("note_id".trim()));
		Session s = FactoryProvider.getFactory().openSession();

		Note note = (Note)s.get(Note.class,noteId);
		%>
		<form action="UpdateServlet" method="post">
	
		<input value="<%= note.getId() %>" name="noteId" type="hidden" />
	
		 <div class="container">
				  <div class="form-group">
		    <label for="title">Note Title</label>
		    <input required type="text"
		    	   name="title" 
		           class="form-control" id="title" 
		           aria-describedby="emailHelp" 
		           placeholder="Enter here"
		           value="<%= note.getTitle()%>">
		      </div>
		      
		  <div class="form-group">
		    <label for="content">Note Content</label>
		    <textarea required id="content" 
		    		  name="content"
		    		  placeholder="Enter your content here" 
		    		  class="form-control" 
		    		  style="height:300px"><%= note.getContent() %>
		    		  </textarea>
		     </div>
		 	<div class="container text-center">
		 	 <button type="submit" class="btn btn-success">Update</button>
		 	</div>
		 
		 </div>
	</form>
	</div>
	
	
</body>
</html>