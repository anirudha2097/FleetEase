package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Bank;

public interface BanksRepo extends JpaRepository<Bank, Integer> {

}
