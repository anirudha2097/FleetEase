package com.fleetease.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Guest;

public interface GuestRepo extends JpaRepository<Guest, Integer> {

	Optional<Guest> findByMobileNo(String mobileNo);

}
