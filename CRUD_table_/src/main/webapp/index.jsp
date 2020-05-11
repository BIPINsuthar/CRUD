<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.bipin.CRUD_table_.dao.*"%>
<%@page import="java.util.List"%>
<%@page import="com.bipin.CRUD_table_.entity.*"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style>
.container {
	margin-top: 50px;
}

.btn {
	margin: 5px;
	padding: -10px;
}

.btn a {
	color: white;
}

.table-thread th {
	padding: 15px;
}

.form-inline {
	margin-left: 1000px;
	margin-top: -45px;
}
</style>
</head>
<body>
	<div class="container">
		<!-- Button trigger modal -->
		<!-- <a href="show.jsp">  </a>-->
		<button class="btn btn-lg btn-info" data-toggle="modal"
			data-target="#exampleModal">New User</button>

		<!-- Modal -->
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title  text-info text-center"
							id="exampleModalLabel">NEW USER</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<div class="container">
							<form class="form-group" action="new" method="post">

								id:<input class="form-control" type="text" name="id" /><br>
								name:<input class="form-control" type="text" name="name" /><br>
								email: <input class="form-control" type="text" name="email" /><br>
								phone:<input class="form-control" type="text" name="phone" /><br>
								Address:<input class="form-control" type="text" name="address" /><br>
								<button class="btn btn-success">submit</button>
								<a href="index.jsp" class="btn btn-warning">Back</a>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- model end -->
	</div>
	
	<div class="search ">
		<form class="form-inline">
			<div class="form-group mx-sm-3 mb-2">
				<input type="text" class="form-control" name="search"
					placeholder="search">
			</div>
		</form>
	</div>
	
	<!-- container -->
	<div class="container">
		<table
			class="table table-light  table-borderless table-hover table-sm">
			<thead class="table-warning">
				<tr class="table-thread">
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Phone</th>
					<th scope="col">Address</th>
					<th scope="col">Edit</th>
					<th scope="col">Delete</th>

				</tr>
			</thead>

			<tbody class="">
				<%
					Student_Dao dao = new Student_Dao();
					String query = request.getParameter("search");
					List<Student> rs = dao.getAlluser(query);
					for (Student s : rs) {
						System.out.println();
				%>
				<tr>
					<th scope="row"><%=s.getID()%></th>
					<td><%=s.getName()%></td>
					<td><%=s.getEmail()%></td>
					<td><%=s.getPhone()%></td>
					<td><%=s.getAddress()%></td>

                     
					<td><a href="Edit.jsp?ID=<%=s.getID()%>"><button
								class="btn btn-warning">Edit</button></a></td>

					<td><a href="delete.jsp?ID=<%=s.getID()%>"><button
								class="btn btn-danger">Delete</button></a></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
	<!-- container end -->
</body>
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</html>


