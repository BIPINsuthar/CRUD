<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.bipin.CRUD_table_.dao.*" %>   
<%@page import="com.bipin.CRUD_table_.entity.*" %> 
<!DOCTYPE html>
<html>
    <head>
        <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
    <style>
        .container
        {
            margin-top: 50px;

        }
        .form-control
        {
           width:400px;
        }
        
    </style>
    </head>
    <body>
   <%
     int id=Integer.parseInt(request.getParameter("ID"));
     Student_Dao dao=new Student_Dao();
     Student s=dao.getUser(id);
   %>
   <div class="container">
   <form class="form-group" action="update" method="post">
			id:<input class="form-control" type="text" name="id" value="<%=s.getID() %>" /><br> 
			name:<input class="form-control" type="text"name="name" value="<%=s.getName()%>"/><br> 
			email: <input  class="form-control"type="text" name="email"value="<%=s.getEmail() %>" /><br>
			phone:<input class="form-control" type="text" name="phone" value="<%=s.getPhone() %>" /><br> 
			Address:<input class="form-control" type="text" name="address" value="<%=s.getAddress()%>"/><br>
			<button class="btn btn-warning">update</button>
			<a href="index.jsp"  class="btn btn-warning">Back</a>
		</form>
	</div>
   <%
   
   %>
  

 </body>
 <!-- jQuery first, then Popper.js, then Bootstrap JS -->
 <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
 <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
 <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</html>
