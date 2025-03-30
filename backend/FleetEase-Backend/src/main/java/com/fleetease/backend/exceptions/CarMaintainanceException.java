package com.fleetease.backend.exceptions;

public class CarMaintainanceException extends RuntimeException {

	public CarMaintainanceException() {

	}
	
	public CarMaintainanceException(String message) {
		
		super(message);
		
	}
}
