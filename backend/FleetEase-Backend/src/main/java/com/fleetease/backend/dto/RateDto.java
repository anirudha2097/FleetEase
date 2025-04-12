package com.fleetease.backend.dto;

import com.fleetease.backend.enums.RatePerson;
import com.fleetease.backend.model.PremiumSedanRate;
import com.fleetease.backend.model.PremiumSuvRate;
import com.fleetease.backend.model.SedanRate;
import com.fleetease.backend.model.SuvRate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RateDto {

	private RatePerson ratePerson;

	private Integer ratePersonId;
	
	private SedanRate sedanRate;
	
	private PremiumSedanRate premiumSedanRate;
	
	private SuvRate suvRate;
	
	private PremiumSuvRate premiumSuvRate;
}
