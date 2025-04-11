package com.fleetease.backend.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Booking;
import com.fleetease.backend.model.Car;
import com.fleetease.backend.model.CarRecord;

public interface CarRecordRepo extends JpaRepository<CarRecord, Integer> {

	Optional<CarRecord> findByBookingId(Booking bookingId);
	
	List<CarRecord> findByCar(Car car);
} 
