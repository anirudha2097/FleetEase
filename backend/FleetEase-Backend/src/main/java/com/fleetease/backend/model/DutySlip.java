package com.fleetease.backend.model;

import java.time.LocalDateTime;

import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.enums.PaymentMode;

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
public class DutySlip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dutySlipId;
	
	private Integer dutySlipNo;

	private Integer bookingId;

	private CabType cabType;

	private String cabRegistrationNo;

	private CabOwner OwnerOfCab;

	private Integer actualDaysOfTrip;

	private Long startKilometer;

	private LocalDateTime StartDateAndTime;

	private Long endKilometer;

	private LocalDateTime endDateAndTime;

	private Long totalTripKilometer;

	private Integer ratePerKilometer;

	private Double parkingAmount;

	private Double totalTollAmount;

	private String route;

	private Long billingKilometer;

	private Double totalBillAmountReceiving;

	private Double TotalBillAmountToCabOwner;

	private Double advanceAmountToCabOwner;

	private Double remainingPaymentToCabOwner;

	private PaymentMode PaymentMethodToCabOwner;

	private String remark;
	
}
