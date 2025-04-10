package com.fleetease.backend.dto;

import java.time.LocalDate;

import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.model.Car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarMaintainanceDto {

	private Car car;

	private Long totalRunningKilometer;

	private String maintainanceDescription;

	private Long maintainanceKilometer;

	private LocalDate maintainanceDate;

	private Double totalBillAmount;

	private Long nextScheduleMaintainanceKilometer;
}
