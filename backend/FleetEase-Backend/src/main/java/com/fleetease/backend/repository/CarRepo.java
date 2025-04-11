package com.fleetease.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.model.CabOwner;
import com.fleetease.backend.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

	Car findByRegistrationNo(String registrationNo);
	
	List<Car> findByCabType(CabType cabType);
	
	List<Car> findByCabOwnerId(Integer cabOwnerId);
}
