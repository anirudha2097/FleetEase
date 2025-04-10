package com.fleetease.backend.model;

import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@Column(unique = true)
	private String mobileNo;
	
	@Embedded
	private Address address;

	@OneToMany(mappedBy = "cab_owner")
	private Set<Car> cabs;
		
}
