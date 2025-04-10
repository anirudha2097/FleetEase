package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

	Car findByRegistrationNo(String registrationNo);
}
