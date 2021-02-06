package com.jeet.FlightReservation.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeet.FlightReservation.Model.Flight;
import com.jeet.FlightReservation.Repository.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository repository;
	
	@RequestMapping(value = "/Findflights" , method = RequestMethod.POST)
	public String searchFlights(@RequestParam("from") String from,@RequestParam("to") String to,
			@DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap model) {
		
		List<Flight> allFlight = repository.findFlights(from,to,departureDate);
		model.addAttribute("flights", allFlight);
		return "DisplayFlights";
	}
	
}
