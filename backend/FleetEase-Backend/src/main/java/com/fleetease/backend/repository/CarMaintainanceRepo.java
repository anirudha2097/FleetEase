package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.CarMaintainance;

public interface CarMaintainanceRepo extends JpaRepository<CarMaintainance, Integer> {

}
