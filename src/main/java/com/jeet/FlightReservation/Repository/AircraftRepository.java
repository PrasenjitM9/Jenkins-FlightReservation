package com.jeet.FlightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.jeet.FlightReservation.Model.Aircraft;

@Service
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {

}
