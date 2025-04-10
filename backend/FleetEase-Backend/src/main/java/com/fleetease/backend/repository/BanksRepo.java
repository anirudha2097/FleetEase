package com.fleetease.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetease.backend.model.Bank;

public interface BanksRepo extends JpaRepository<Bank, Integer> {

	Bank findByAccountNoAndIfscCode(String accountNo, String ifscCode);
	
	Bank findByAccountNo(String accountNo);
}
