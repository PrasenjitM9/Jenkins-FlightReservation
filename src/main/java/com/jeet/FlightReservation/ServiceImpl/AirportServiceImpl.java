package com.jeet.FlightReservation.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jeet.FlightReservation.Model.Airport;
import com.jeet.FlightReservation.Repository.AirportRepository;
import com.jeet.FlightReservation.Service.AirportService;

@Service
public class AirportServiceImpl implements AirportService {
	
	private AirportRepository airportRepository;
	
	@Autowired
	public AirportServiceImpl(AirportRepository airportRepository) {
		this.airportRepository = airportRepository;
	}

	@Override
	public Page<Airport> getAllAirportsPage(int pageNum) {
		return airportRepository.findAll(PageRequest.of(pageNum, 5, Sort.by("airportName")));
	}

	@Override
	public List<Airport> getAllAirports() {
		return airportRepository.findAll();
	}

	@Override
	public Optional<Airport> getAirportById(Integer airportId) {
		return airportRepository.findById(airportId);
	}

	@Override
	public Airport saveAirport(Airport airport) {
		return airportRepository.save(airport);
	}

	@Override
	public void deleteAirport(Integer airportId) {
		airportRepository.deleteById(airportId);
		
	}

	
}