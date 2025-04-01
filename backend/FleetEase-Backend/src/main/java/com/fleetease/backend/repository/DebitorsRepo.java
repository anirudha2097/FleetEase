package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Debitor;

public interface DebitorsRepo extends JpaRepository<Debitor, Integer> {

}
