package com.jeet.FlightReservation.Service;

import com.jeet.FlightReservation.DTO.ReservationRequest;
import com.jeet.FlightReservation.Model.Reservation;

public interface ReservationService {
	
	public Reservation flightBooking(ReservationRequest request);

}
