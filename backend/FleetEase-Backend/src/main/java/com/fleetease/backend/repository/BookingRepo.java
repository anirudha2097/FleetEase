package com.fleetease.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer> {

	List<Booking> findByVendorId(Integer vendorId);
	
}
