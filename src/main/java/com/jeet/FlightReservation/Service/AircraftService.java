package com.jeet.FlightReservation.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.jeet.FlightReservation.Model.Aircraft;

public interface AircraftService {
	
	public abstract Page<Aircraft> getAllAircraftsPaged(int  pageNum);
	public abstract List<Aircraft> getAllAircrafts();
	public abstract Aircraft getAircraftById(Long aircraftId);
	public abstract Aircraft saveAircraft(Aircraft aircraft);
	public abstract void deleteAircraftById(Long aircraftId);
}
