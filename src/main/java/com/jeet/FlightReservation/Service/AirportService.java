package com.jeet.FlightReservation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.jeet.FlightReservation.Model.Airport;

public interface AirportService {
	
	public abstract Page<Airport> getAllAirportsPage(int pageNum);
	public abstract List<Airport> getAllAirports();
	public abstract Optional<Airport> getAirportById(Integer airportId);
	
	public abstract Airport saveAirport(Airport airport);
	public abstract void deleteAirport(Integer airportId);
	

}
