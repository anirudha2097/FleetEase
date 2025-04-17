package com.fleetease.backend.model;

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
public class CarRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carRecordId;
	
	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "booking_id")
	private Booking bookingId;

	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "dutyslip_id")
	private DutySlip dutyslipId;

	@ManyToOne
//	@JoinColumn(name = "car_id")
	private Car car;

	@ManyToOne
//	@JoinColumn(name = "guest_id")
	private Guest guestId;

	private String Route;

	private Long totalKilometer;

	private Long totalBillAmount;

	private Long fuelTopupKilometer;

	private Double fuelTopupAmount;

	private Double fuelTopupInLitre;

	private Double fuelEfficiency;

	private Double Profit;

	@OneToOne
	@JoinColumn(name = "car_maintainance_car_maintainance_id", referencedColumnName = "carMaintainanceId")
	private CarMaintainance carMaintainance;
//	private Double maintainanceTotalBillAmount;

}
