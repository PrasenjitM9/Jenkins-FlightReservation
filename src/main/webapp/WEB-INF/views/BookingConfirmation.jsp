<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Confirmation</title>
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
	
	<div class="container">
		<h2>Booking Confirmation</h2>
		<p>Click Open to get Details of Your Booking information</p>
		<!-- Button to Open the Modal -->
		<button type="button" class="btn btn-primary" data-toggle="modal"
			data-target="#myModal">Open</button>

		<!-- The Modal -->
				<div class="modal fade" id="myModal">
					<div class="modal-dialog modal-dialog-centered">
						<div class="modal-content">

							<!-- Modal Header -->
							<div class="modal-header">
								<h4 class="modal-title">Flight Booked</h4>
								<button type="button" class="close" data-dismiss="modal">&times;</button>
							</div>

							<!-- Modal body -->
							<div class="modal-body">
									<h4>${bookFlightReservation}</h4>
									<b>Congratulation...</b> <br>You have Successfully Booked your flight.
									Go to your Systems Download folder, your Reservation Details
									are saved to your Systems Downloads folder with name <b>reservationID.</b>	
									Now, Click <b><a href="http://localhost:9090/FlightCheckIn/startShowCheckIn">HERE</a></b> 
									to CheckIn your Bags to perform complete Flight Reservation..
									You Need Reservation ID to perform CheckIn 						
							</div>

							<!-- Modal footer -->
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
							</div>

						</div>
					</div>
				</div>

	</div>
</body>
</html>