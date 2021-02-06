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

import com.jeet.FlightReservation.Model.Aircraft;
import com.jeet.FlightReservation.Service.AircraftService;

@Controller
public class AircraftController {
	
	@Autowired
	AircraftService aircraftService;
	
	@GetMapping("/aircraft/new")
	public String showAddAircraftPage(Model model) {
		
		model.addAttribute("aircraft", new Aircraft());
		return "newAircraft";
	}

	@PostMapping("/aircraft/new")
	public String saveAircraft(@Valid @ModelAttribute("aircraft") Aircraft aircraft, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("aircraft", new Aircraft());
            return "newAircraft";
        }
		aircraftService.saveAircraft(aircraft);
        model.addAttribute("aircrafts", aircraftService.getAllAircraftsPaged(0));
        model.addAttribute("currentPage", 0);
        return "aircrafts";
	}
	
	@GetMapping("/aircraft/delete")
    public String deleteAircraft(@PathParam("aircraftId") long aircraftId, Model model){
        aircraftService.deleteAircraftById(aircraftId);
        model.addAttribute("aircrafts", aircraftService.getAllAircraftsPaged(0));
        model.addAttribute("currentPage", 0);
        return "aircrafts";
    }

    @GetMapping("/aircrafts")
    public String showAircraftsList(@RequestParam(defaultValue = "0") int pageNo, Model model) {
        model.addAttribute("aircrafts", aircraftService.getAllAircraftsPaged(pageNo));
        model.addAttribute("currentPage", pageNo);
        return "aircrafts";
    }
}
