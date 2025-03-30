package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Creditors;

public interface CreditorsRepo extends JpaRepository<Creditors, Integer> {

}
