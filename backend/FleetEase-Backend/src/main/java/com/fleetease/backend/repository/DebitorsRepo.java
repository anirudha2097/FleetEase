package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Debitors;

public interface DebitorsRepo extends JpaRepository<Debitors, Integer> {

}
