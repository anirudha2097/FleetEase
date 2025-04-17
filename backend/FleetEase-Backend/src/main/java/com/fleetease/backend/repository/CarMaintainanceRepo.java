package com.fleetease.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Car;
import com.fleetease.backend.model.CarMaintainance;

public interface CarMaintainanceRepo extends JpaRepository<CarMaintainance, Long> {

	List<CarMaintainance> findByCar(Car car);
}
