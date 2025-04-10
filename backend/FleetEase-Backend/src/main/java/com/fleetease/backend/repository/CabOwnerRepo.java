package com.fleetease.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.CabOwner;

public interface CabOwnerRepo extends JpaRepository<CabOwner, Integer> {

	CabOwner findByMobileNo(String mobileNo);
	
}
