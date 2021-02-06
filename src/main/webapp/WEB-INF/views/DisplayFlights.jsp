<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights Details</title>
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
	<div class="container-sm" style="text-align: center; max-width: 1000px">
		<h3>All Flights Details:-</h3>
		<table class="table table-hover">
			<tr>
				<th>Flight Number</th>
				<th>Airlines</th>
				<th>Departure City</th>
				<th>Arrival City</th>
				<th>Departure Time</th>
			</tr>

			<c:forEach items="${flights}" var="flight">
				<tr>
					<td>${flight.flightNumber}</td>
					<td>${flight.operatingAirlines}</td>
					<td>${flight.departureCity}</td>
					<td>${flight.arrivalCity}</td>
					<td>${flight.estimatedDepartureTime}</td>
					<td><a href="getAllFlightDetail?flightId=${flight.id}"
						class="btn btn-primary">Select</a></td>
				</tr>

			</c:forEach>

		</table>
	</div>

</body>
</html>