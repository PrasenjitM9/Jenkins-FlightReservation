package com.jeet.FlightReservation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8320373820602570239L;

	public UserNotFoundException(String message) {
		super(message);
	}
}