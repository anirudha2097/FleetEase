package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Firm;

public interface FirmRepo extends JpaRepository<Firm, Integer> {

}
