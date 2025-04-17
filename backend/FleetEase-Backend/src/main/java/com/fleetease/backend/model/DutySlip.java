package com.fleetease.backend.model;

import java.time.LocalDateTime;

import com.fleetease.backend.enums.PaymentMode;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

//	(mappedBy ="dutyslip")
	@OneToOne(cascade = CascadeType.ALL)
	private Booking bookingId;

//	private CabType cabType;

//	car registration no (mappedBy = "dutyslip")
	@OneToOne(cascade = CascadeType.ALL)
	private Car car;

	@ManyToOne
//	@JoinColumn(name = "cab_owner_id")
	private CabOwner cabOwner;

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

	private Double totalBillAmountToCabOwner;

	private Double advanceAmountToCabOwner;

	private Double remainingPaymentToCabOwner;

	private PaymentMode paymentModeToCabOwner;
	
	private PaymentMode receivingPaymentMode;

	@OneToOne(cascade = CascadeType.ALL)
	private Bill bill;
	
	private String remark;
	
}
