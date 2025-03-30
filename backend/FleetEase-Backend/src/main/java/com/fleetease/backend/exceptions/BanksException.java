package com.fleetease.backend.exceptions;

public class BanksException extends RuntimeException {

	public BanksException() {

	}
	
	public BanksException(String message) {
		
		super(message);
		
	}
}
