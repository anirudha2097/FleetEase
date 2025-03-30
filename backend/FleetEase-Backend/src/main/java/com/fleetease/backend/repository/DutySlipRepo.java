package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.DutySlip;

public interface DutySlipRepo extends JpaRepository<DutySlip, Integer> {

}
