<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-sm" style="text-align: center; max-width: 500px">
	<h3>Login Page</h3>
	<form action="LoginPage" method="post" >
			
		<div class="form-group">
			<label>Email</label> 
			<input type="email" class="form-control" placeholder="Enter your Email" required="required" name="email"/>
		</div>
		<div class="form-group">
			<label>Password</label>
			<input type="password" class="form-control" placeholder="Enter Your Password" required="required" name="password"/>
		</div>								
		<input type="submit" class="btn btn-primary" value="Log In"/> <br>
					
			<div class="alert alert-danger alert-dismissible">
   				 <button type="button" class="close" data-dismiss="alert">&times;</button>
    			<strong>${wrong}</strong> Email or Password Does not match..
  			</div>
		
	</form>
</div>
</body>
</html>