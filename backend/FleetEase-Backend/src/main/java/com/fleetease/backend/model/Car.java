package com.fleetease.backend.model;

import java.time.Year;

import com.fleetease.backend.enums.CabType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carId;
	
	private String registrationNo;
	
	private String manufacturer;
	
	private String modelName;
	
	private Year registrationYear;
	
	private CabType cabType;
	
	@ManyToOne
	@JoinColumn(name="cab_owner_id", nullable=false)
	private CabOwner cabOwnerId;
}
