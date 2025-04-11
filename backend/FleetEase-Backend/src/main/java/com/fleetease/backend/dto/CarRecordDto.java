package com.fleetease.backend.dto;

import com.fleetease.backend.model.Booking;
import com.fleetease.backend.model.Car;
import com.fleetease.backend.model.CarMaintainance;
import com.fleetease.backend.model.DutySlip;
import com.fleetease.backend.model.Guest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarRecordDto {

	private Booking bookingId;

	private DutySlip dutyslipId;

	private Car car;

	private Guest guestId;

	private String Route;

	private Long totalKilometer;

	private Long totalBillAmount;

	private Long fuelTopupKilometer;

	private Double fuelTopupAmount;

	private Double fuelTopupInLitre;

	private Double fuelEfficiency;

	private Double Profit;

	private CarMaintainance carMaintainance;
//	private Double maintainanceTotalBillAmount;

}
