package com.jeet.FlightReservation.exception;

public class UserAlreadyRegisteredException extends RuntimeException {

	private static final long serialVersionUID = 7404226350386517896L;

	public UserAlreadyRegisteredException(String message) {
		super(message);
	}
}