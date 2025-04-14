package com.fleetease.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Firm;

public interface FirmRepo extends JpaRepository<Firm, Integer> {

	Optional<Firm> findByMobileNo(String mobileNo);
}
