<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Flight</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-sm" style="text-align: center; max-width: 500px">
	<h3>Find Flights</h3>
	
	<form action="Findflights" method="post">
		<div class="form-group">
			<label>From</label>
			<input type="text" class="form-control" placeholder="Enter Departure Place" required="required" name="from" />
		</div>
		<div class="form-group">
			<label>To</label>
			<input type="text" class="form-control" placeholder="Enter Arrival Place" required="required" name="to" />	
		</div>
		<div class="form-group">
			<label>Departure Time</label>
			<input type="text" class="form-control" placeholder="MM-dd-YYY" required="required" name="departureDate" />
		</div>
					
	<input type="submit" class="btn btn-primary" value="Search Flights" />		
	</form>
</div>
	
</body>
</html>