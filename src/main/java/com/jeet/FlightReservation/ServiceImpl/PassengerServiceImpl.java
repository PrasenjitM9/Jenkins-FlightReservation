package com.jeet.FlightReservation.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import com.jeet.FlightReservation.Model.Passenger;
import com.jeet.FlightReservation.Repository.PassengerRepository;
import com.jeet.FlightReservation.Service.PassengerService;

public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;
	
	@Override
	public Page<Passenger> getAllPassengersPaged(int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> getAllPassengers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger getPassengerById(Long passengerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger savePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePassengerById(Long passengerId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
