package com.jeet.FlightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeet.FlightReservation.Model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
