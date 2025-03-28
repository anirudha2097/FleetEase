package com.fleetease.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CarRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carRecordId;
	
	private Integer bookingId;

	private Integer dutySlipID;

	private String carRegistrationNo;

	private String guestName;

	private String Route;

	private Long totalKilometer;

	private Long totalBillAmount;

	private Long fuelTopupKilometer;

	private Double fuelTopupAmount;

	private Double fuelTopupInLitre;

	private Double fuelEfficiency;

	private Double Profit;

	private Double maintainanceTotalBillAmount;

}
