package com.fleetease.backend.dto;

import java.util.Set;

import com.fleetease.backend.model.Address;
import com.fleetease.backend.model.Car;

import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CabOwnerDto {
	
	private String cabOwnerName;
	
	private String mobileNo;
	
	@Embedded
	private Address address;

	private Set<Car> cabs;
	
}
