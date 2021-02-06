package com.jeet.FlightReservation.IntegrationLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeet.FlightReservation.Model.Reservation;
import com.jeet.FlightReservation.Repository.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRestController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
		
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") int id)
	{
		return reservationRepository.findById(id).get();		
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody UpdateReservationRequest request)
	{
		Reservation res = reservationRepository.findById(request.getId()).get();
		res.setCheckedIn(request.getCheckedIn());
		res.setNumberOfBags(request.getNumberOfBags());
		return reservationRepository.save(res);
	}

}
