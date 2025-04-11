package com.fleetease.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Optional<Employee> findByMobileNo(String mobileNo);
}
