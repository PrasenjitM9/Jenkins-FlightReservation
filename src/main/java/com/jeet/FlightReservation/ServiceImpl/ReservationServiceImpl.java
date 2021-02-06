package com.jeet.FlightReservation.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeet.FlightReservation.DTO.ReservationRequest;
import com.jeet.FlightReservation.Model.Flight;
import com.jeet.FlightReservation.Model.Passenger;
import com.jeet.FlightReservation.Model.Reservation;
import com.jeet.FlightReservation.Repository.FlightRepository;
import com.jeet.FlightReservation.Repository.PassengerRepository;
import com.jeet.FlightReservation.Repository.ReservationRepository;
import com.jeet.FlightReservation.Service.ReservationService;
import com.jeet.FlightReservation.util.PdfGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	PdfGenerator pdf;

	@Override
	@Transactional
	public Reservation flightBooking(ReservationRequest request) {
		
		int flightId = request.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassenggerFirstName());
		passenger.setLastName(request.getPassenggerLastName());
		passenger.setMiddleName(request.getPassenggerMiddleName());
		passenger.setEmail(request.getPassenggerEmail());
		passenger.setPhone(request.getPassenggerPhone());		
		Passenger passengerSaved = passengerRepository.save(passenger);
		
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passengerSaved);
		reservation.setCheckedIn(false);
		Reservation reservationSaved = reservationRepository.save(reservation);
		
		String path = "C:\\Users\\Jeet\\Downloads\\reservationID_"+reservation.getId()+".pdf";
		pdf.generatePDF(reservationSaved, path);
		
		return reservationSaved;
	}

}
