package com.jeet.FlightReservation.Controller;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeet.FlightReservation.Model.Airport;
import com.jeet.FlightReservation.Service.AirportService;

@Controller
public class AirportController {

	@Autowired
	private AirportService airportService;
	
	@GetMapping("/airport/new")
    public String showAddAirportPage(Model model) {
        model.addAttribute("airport", new Airport());
        return "newAirport";
    }

    @PostMapping("/airport/new")
    public String saveAirport(@Valid @ModelAttribute("airport") Airport airport, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("airport", new Airport());
            return "newAirport";
        }
        airportService.saveAirport(airport);
        model.addAttribute("airports", airportService.getAllAirportsPage(0));
        model.addAttribute("currentPage", 0);
        return "airports";
    }
    @GetMapping("/airport/delete")
    public String deleteAirport(@PathParam("airportId") int airportId, Model model){
        airportService.deleteAirport(airportId);
        model.addAttribute("airports", airportService.getAllAirportsPage(0));
        model.addAttribute("currentPage", 0);
        return "airports";
    }

    @GetMapping("/airports")
    public String showAirportsList(@RequestParam(defaultValue = "0") int pageNo, Model model) {
        model.addAttribute("airports", airportService.getAllAirportsPage(pageNo));
        model.addAttribute("currentPage", pageNo);
        return "airports";
    }
}
