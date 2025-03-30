package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.CarRecord;

public interface CarRecordRepo extends JpaRepository<CarRecord, Integer> {

}
