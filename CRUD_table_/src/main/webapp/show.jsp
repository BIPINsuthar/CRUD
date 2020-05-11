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
.form-control
{
  width:400px;
  
}
</style>
</head>
<body>
	<div class="container">
		<form class="form-group" action="new" method="post">
	
			id:<input class="form-control" type="text" name="id" /><br>
			name:<input class="form-control"type="text"name="name" /><br>
			email: <input class="form-control" type="text" name="email" /><br>
			phone:<input class="form-control"type="text" name="phone" /><br>
			Address:<input class="form-control"type="text" name="address"/><br>
			<button class="btn btn-success">submit</button>
			<a href="index.jsp"  class="btn btn-warning">Back</a>
			</form>
			</div>
			</body>
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</html>