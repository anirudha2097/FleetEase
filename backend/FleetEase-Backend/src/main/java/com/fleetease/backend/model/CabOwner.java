package com.fleetease.backend.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fleetease.backend.enums.CabType;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CabOwner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cabOwnerId;
	
	private String cabOwnerName;
	
	@Embedded
	private Address address;

	private List<String> cabRegistrationNo;
	
	private CabType cabType;
	
}
