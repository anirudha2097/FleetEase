package com.fleetease.backend.model;

import java.time.LocalDate;
import java.util.List;

import com.fleetease.backend.enums.CabType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CarMaintainance {

	@Id
	private String registrationNo;

	private CabType carType;

	private Long totalRunningKilometer;

	private String changedSparePartName;

	private Long maintainanceKilometer;

	private LocalDate maintainanceDate;

	private Double totalBillAmount;

	private Long nextScheduleMaintainanceKilometer;
}
