package com.fleetease.backend.dto;

import java.time.LocalDateTime;

import com.fleetease.backend.enums.PaymentMode;
import com.fleetease.backend.model.Booking;
import com.fleetease.backend.model.CabOwner;
import com.fleetease.backend.model.Car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DutySlipDto {

	private Integer dutySlipNo;

	private Booking bookingId;

//	private CabType cabType;

//	car registration no
	private Car car;

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

	private Double TotalBillAmountToCabOwner;

	private Double advanceAmountToCabOwner;

	private Double remainingPaymentToCabOwner;

	private PaymentMode PaymentModeToCabOwner;

	private String remark;
}
