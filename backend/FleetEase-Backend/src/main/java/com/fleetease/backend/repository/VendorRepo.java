package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer> {

}
