package com.jeet.FlightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeet.FlightReservation.Model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {

}
