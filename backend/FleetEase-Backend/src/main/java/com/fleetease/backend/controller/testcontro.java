package com.fleetease.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class testcontro {

	@GetMapping("/test")
	public ResponseEntity<String> testApi(){
		return ResponseEntity.ok("api is working properly.");
	}
}
