<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-sm" style="text-align: center; max-width: 450px">
		<h3>Your Flight Details....</h3>
		<table class="table table-borderless">
			<tbody>
				<tr>
					<td>Airline:-</td>
					<td>${selectedFlight.operatingAirlines}</td>
				</tr>
				<tr>
					<td>Departure City:-</td>
					<td>${selectedFlight.departureCity}</td>
				</tr>
				<tr>
					<td>Arrival City:-</td>
					<td>${selectedFlight.arrivalCity}</td>
				</tr>
			</tbody>
		</table>
	</div>

	<form action="completeReservation" method="post">

		<div class="row">
			<div class="col-sm-5">
				<b style="text-align: left;">PASSENGER DETAILS...............................................</b> <br>
				<div class="form-group">
					<label>First Name</label> <input type="text" class="form-control"
						placeholder="Enter Your First Name" required="required" name="passenggerFirstName" />
				</div>
				<div class="form-group">
					<label>Last Name</label> <input type="text" class="form-control"
						placeholder="Enter Your Last Name" required="required" name="passenggerLastName" />
				</div>
				<div class="form-group">
					<label>Middle Name(if any)</label> <input type="text"
						class="form-control" placeholder="Enter Your Middle Name(if any)" required="required"
						name="passenggerMiddleName" />
				</div>
				<div class="form-group">
					<label>Email</label> <input type="text" class="form-control"
						placeholder="Enter Your Email Address" required="required" name="passenggerEmail" />
				</div>
				<div class="form-group">
					<label>Phone</label> <input type="text" class="form-control"
						placeholder="Enter Your Phone Number" required="required" name="passenggerPhone" />
				</div>
			</div>

			<div class="col-sm-6">
				<b style="text-align: left;">CARD
					DETAILS(Its a dummy Module)............................</b>
				<div class="form-group">
					<label>Name on the Card</label> <input type="text"
						class="form-control" placeholder="name on Your Card"
						name="passenggerCardName" />
				</div>
				<div class="form-group">
					<label>Card Number</label> <input type="text" class="form-control"
						placeholder="Card Number" name="passenggerCardNumber" />
				</div>
				<div class="form-group">
					<label>Expire Date</label> <input type="text" class="form-control"
						placeholder="Expired Date" name="passenggerExpireDate" />
				</div>
				<div class="form-group">
					<label>Three Digit Secure Code</label> <input type="text"
						class="form-control" placeholder="CVV" name="passenggerSecureCode" />
				</div>
				<input type="submit" class="btn btn-primary" value="Confirm Booking" />
				
						<input type="hidden" name="flightId" value="${selectedFlight.id}" />

			</div>

		</div>
	</form>


</body>
</html>




