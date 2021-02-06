package com.jeet.FlightReservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeet.FlightReservation.DTO.ReservationRequest;
import com.jeet.FlightReservation.Model.Flight;
import com.jeet.FlightReservation.Model.Reservation;
import com.jeet.FlightReservation.Repository.FlightRepository;
import com.jeet.FlightReservation.Service.ReservationService;

import io.swagger.annotations.Api;

@Controller
@Api(value="Flight Reservation", description="Reservation Rest end points. Find All Flights and Flight Reservation")
public class ReservationController {
	
	@Autowired
	FlightRepository repository;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/getAllFlightDetail")
	public String getAllFlightInfo(@RequestParam("flightId") int id , ModelMap model)
	{
		Flight flight = repository.findById(id).get();
		model.addAttribute("selectedFlight", flight);
		return "ConfirmFlight";
	}
	
	@RequestMapping(value = "/completeReservation" , method = RequestMethod.POST)
	public String reservationFlight(ReservationRequest request , ModelMap model)
	{
		Reservation reservation = reservationService.flightBooking(request);
		model.addAttribute("bookFlightReservation", "Your Reservation ID:- "+reservation.getId());
		return "BookingConfirmation";
	}
}
