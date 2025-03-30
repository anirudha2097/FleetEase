package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Banks;

public interface BanksRepo extends JpaRepository<Banks, Integer> {

}
