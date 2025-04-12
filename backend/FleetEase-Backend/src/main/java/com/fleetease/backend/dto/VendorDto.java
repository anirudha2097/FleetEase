package com.fleetease.backend.dto;

import com.fleetease.backend.model.Address;
import com.fleetease.backend.model.Rate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorDto {

	private String name;
	
	private Address address;
	
	private String gstinNo;
	
	private String mobileNo;
	
	private Rate rate;
}
