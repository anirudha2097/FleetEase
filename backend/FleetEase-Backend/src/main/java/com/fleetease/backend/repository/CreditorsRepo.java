package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Creditor;

public interface CreditorsRepo extends JpaRepository<Creditor, Integer> {

}
