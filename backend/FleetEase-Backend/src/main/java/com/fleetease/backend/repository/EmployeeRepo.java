package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
