package com.fleetease.backend.dto;

import java.time.Year;

import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.model.CabOwner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

	private String registrationNo;
	
	private String manufacturer;
	
	private String modelName;
	
	private Year registrationYear;
	
	private CabType cabType;
	
	private CabOwner cabOwnerId;
}
