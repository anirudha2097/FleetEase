package com.fleetease.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
