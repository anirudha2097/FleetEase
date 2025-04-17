package com.fleetease.backend.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vendorId;
	
	private String name;
	
	@Embedded
	private Address address;
	
	@Column(unique = true)
	private String gstinNo;
	
	@Column(unique = true)
	private String mobileNo;
	
//	(mappedBy = "vendor_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Rate rate;
}
