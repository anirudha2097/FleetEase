package com.fleetease.backend.model;

import com.fleetease.backend.enums.RatePerson;

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
public class Rate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rateId;
	
//	Vendor or Cab owner
	private RatePerson ratePerson;
	
//	Vendor id or Cab ownder id
	private Integer ratePersonId;
	
	@Embedded
//	@Column(name="sedan_rate", insertable=false, updatable=false)
	private SedanRate sedanRate;
	
	@Embedded
//	@Column(name="premium_sedan_rate", insertable=false, updatable=false)
	private PremiumSedanRate premiumSedanRate;
	
	@Embedded
//	@Column(name="suv_rate", insertable=false, updatable=false)
	private SuvRate suvRate;
	
	@Embedded
//	@Column(name="premiumt_suv_rate", insertable=false, updatable=false)
	private PremiumSuvRate premiumSuvRate;
}
