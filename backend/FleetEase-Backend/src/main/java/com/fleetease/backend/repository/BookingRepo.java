package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
