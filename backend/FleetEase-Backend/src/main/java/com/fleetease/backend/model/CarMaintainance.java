package com.fleetease.backend.model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CarMaintainance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long carMaintainanceId;
	
//	@JoinColumn(name = "car_id")
	@ManyToOne
	private Car car;

	private Long totalRunningKilometer;

	private String maintainanceDescription;

	private Long maintainanceKilometer;

	private LocalDate maintainanceDate;

	private Double totalBillAmount;

	private Long nextScheduleMaintainanceKilometer;
}
