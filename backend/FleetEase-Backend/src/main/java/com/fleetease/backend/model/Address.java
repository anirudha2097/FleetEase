package com.fleetease.backend.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

	private String location;
	
	private String city;
	
	private String state;

	private String contry;
	
	private String pincode;
}
