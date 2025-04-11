package com.fleetease.backend.exceptions;

public class GuestException extends RuntimeException {

	public GuestException() {

	}
	
	public GuestException(String message) {
		
		super(message);
		
	}
}
