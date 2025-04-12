package com.fleetease.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer> {

	Optional<Vendor> findByMobileNo(String mobileNo);
}
