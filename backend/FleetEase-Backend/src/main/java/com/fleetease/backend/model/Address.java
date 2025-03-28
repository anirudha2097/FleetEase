package com.fleetease.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	private String location;
	
	private String city;
	
	private String state;

	private String contry;
	
	private String pincode;
}
