package com.fleetease.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Firm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer firmId;
	
	private String name;
	
	private Address address;
	
	private String contactNo;
	
	private String GstinNo;
	
	@OneToOne
	private User userId;
	
	
}
