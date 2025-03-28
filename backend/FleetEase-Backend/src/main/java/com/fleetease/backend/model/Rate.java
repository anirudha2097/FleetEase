package com.fleetease.backend.model;

import com.fleetease.backend.enums.IdType;

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
	
	private IdType idType;
	
	private Integer idTypeValue;
	
	@Embedded
	private SedanRate sedanRate;
	
	@Embedded
	private PremiumSedanRate premiumSedanRate;
	
	@Embedded
	private SuvRate suvRate;
	
	@Embedded
	private PremiumSuvRate premiumSuvRate;
}
