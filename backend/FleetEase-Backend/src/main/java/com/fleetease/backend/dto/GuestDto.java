package com.fleetease.backend.dto;

import com.fleetease.backend.model.Guest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestDto {

	private String name;
	
	private String mobileNo;
}
