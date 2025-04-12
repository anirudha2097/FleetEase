package com.fleetease.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.enums.RatePerson;
import com.fleetease.backend.model.Rate;

public interface RateRepo extends JpaRepository<Rate, Integer> {

	Optional<Rate> findByRatePersonAndRatePersonId(RatePerson ratePerson,Integer ratePersonId);
	
}
