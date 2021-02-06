package com.jeet.FlightReservation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlightNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -694098171592916391L;

	public FlightNotFoundException(String exception) {
		super(exception);
	}
}