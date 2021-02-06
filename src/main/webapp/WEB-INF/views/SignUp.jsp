<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
	function validate()
	{	
		var a = document.myform.password.value;
		var b = document.myform.confirmPassword.value;
		if(a != b)
		{
			alert("password does not match");
			document.myform.confirmPassword.focus();
			return false;
		}
	}
  </script>
  
</head>
<body>
	<div class="container-sm" style="text-align: center; max-width: 500px">
	<h3>Registration Page</h3>
	<form action="SignUpPage" method="post" name="myform">		
		<div class="form-group">
					<label>First Name</label> 
					<input type="text" class="form-control" placeholder="First Name" required="required" name="firstName"/>
		</div>
		<div class="form-group">
					<label>Last Name</label>
					<input type="text" class="form-control" placeholder="Last Name" required="required" name="lastName"/>
		</div>
		<div class="form-group">
					<label>Email</label>
					<input type="email" class="form-control" placeholder="Email" required="required" name="email"/>
		</div>
		<div class="form-group">
					<label>Password</label>
					<input type="password" class="form-control" placeholder="Password" required="required" name="password"/>
		</div>
		<div class="form-group">
					<label>Confirm Password</label>
					<input type="password" class="form-control" placeholder="Re-Enter Password" required="required" name="confirmPassword"/>
		</div>	
								
		<input type="submit" class="btn btn-primary" value="Sign Up" onclick="return validate();" />	
		
			 <p class="font-weight-light">If You already Sign-Up then click <a href="login">here</a> to login   </p>
	</form>
	</div>
	
</body>
</html>