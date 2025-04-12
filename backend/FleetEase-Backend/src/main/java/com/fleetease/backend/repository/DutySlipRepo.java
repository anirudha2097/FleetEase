package com.fleetease.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Booking;
import com.fleetease.backend.model.DutySlip;

public interface DutySlipRepo extends JpaRepository<DutySlip, Integer> {

	Optional<DutySlip> findByBookingId(Booking bookingId);
	
	
}
