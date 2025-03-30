package com.fleetease.backend.exceptions;

public class BookingException extends RuntimeException {

	public BookingException() {

	}
	
	public BookingException(String message) {
		
		super(message);
		
	}
}
