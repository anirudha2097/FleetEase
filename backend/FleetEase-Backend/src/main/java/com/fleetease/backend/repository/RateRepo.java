package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Rate;

public interface RateRepo extends JpaRepository<Rate, Integer> {

}
