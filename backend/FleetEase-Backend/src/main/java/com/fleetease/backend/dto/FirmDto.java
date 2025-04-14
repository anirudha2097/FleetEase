package com.fleetease.backend.dto;

import com.fleetease.backend.model.Address;
import com.fleetease.backend.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FirmDto {

	private String name;
	
	private Address address;
	
	private String mobileNo;
	
	private String GstinNo;
	
	private User userId;
}
