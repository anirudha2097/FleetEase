package com.fleetease.backend.model;

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
public class Debitor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer debtorsId;
	
	private Integer bookingsID;

	private Integer billNo;

	private Double billAmount;

	private PaymentMode paymentMode;

	private String remark;
}
