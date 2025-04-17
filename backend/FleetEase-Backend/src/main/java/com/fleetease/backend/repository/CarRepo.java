package com.fleetease.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.model.CabOwner;
import com.fleetease.backend.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

	Car findByRegistrationNo(String registrationNo);
	
	List<Car> findByCabType(CabType cabType);
	
//	@Query("SELECT c FROM Car c WHERE c.cabOwner.id = :ownerId")
//	List<Car> findByCabOwnerId(@Param("ownerId") Integer ownerId);
	
	List<Car> findByCabOwnerId(Integer cabOwnerId);
}
