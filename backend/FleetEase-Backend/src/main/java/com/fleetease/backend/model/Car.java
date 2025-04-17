package com.fleetease.backend.model;

import java.time.Year;

import com.fleetease.backend.enums.CabType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

	@Column(unique = true)
	private String registrationNo;
	
	private String manufacturer;
	
	private String modelName;
	
	private Integer registrationYear;
	
	@Enumerated(EnumType.STRING)
	private CabType cabType;
	
	@ManyToOne
	@JoinColumn(name="cab_owner_id")
	private CabOwner cabOwner;
	
}
