package com.jeet.FlightReservation.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.jeet.FlightReservation.Model.Passenger;

public interface PassengerService {
	
	public abstract Page<Passenger> getAllPassengersPaged(int pageNum);
    public abstract List<Passenger> getAllPassengers();
    public abstract Passenger getPassengerById(Long passengerId);
    public abstract Passenger savePassenger(Passenger passenger);
    public abstract void deletePassengerById(Long passengerId);
}