package com.fleetease.backend.exceptions;

public class BankException extends RuntimeException {

	public BankException() {

	}
	
	public BankException(String message) {
		
		super(message);
		
	}
}
