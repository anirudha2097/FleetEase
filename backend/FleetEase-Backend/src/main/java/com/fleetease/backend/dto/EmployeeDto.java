package com.fleetease.backend.dto;

import com.fleetease.backend.enums.Role;
import com.fleetease.backend.model.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private String name;

	private Address address;

	private String mobileNo;

	private Role role;
	
}
