package com.jeet.FlightReservation.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jeet.FlightReservation.Model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	@Query("from Flight where departureCity=:departure and arrivalCity=:arrival and dateOfDeparture=:date")
	List<Flight> findFlights(@Param("departure") String from,@Param("arrival") String to,@Param("date") Date departureDate);

}
