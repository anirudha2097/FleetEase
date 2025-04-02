package com.fleetease.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleetease.backend.dto.BankDto;
import com.fleetease.backend.model.Bank;
import com.fleetease.backend.service.BankService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/bank")
public class testcontro {

	@Autowired
	private BankService bankService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Bank>> getBank(){
		
		List<Bank> bank = bankService.getAllBanks();
		
		return new ResponseEntity<List<Bank>>(bank, HttpStatus.OK);
	}
	
	@PostMapping("/addBank")
	public ResponseEntity<Bank> addBank(@Valid @RequestBody BankDto bankDto){
		

		Bank savedBank = bankService.addBank(bankDto);
		
		return new ResponseEntity<Bank>(savedBank, HttpStatus.OK);
	}
	
}
