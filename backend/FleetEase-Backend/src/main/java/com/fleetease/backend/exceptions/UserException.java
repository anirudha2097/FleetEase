package com.fleetease.backend.exceptions;

public class UserException extends RuntimeException {

	public UserException() {

	}
	
	public UserException(String message) {
		
		super(message);
		
	}
}
