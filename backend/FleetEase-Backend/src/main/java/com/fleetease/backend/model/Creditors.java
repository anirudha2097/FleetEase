package com.fleetease.backend.model;

import com.fleetease.backend.enums.PaymentMode;
import com.fleetease.backend.enums.PaymentStatus;

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
public class Creditors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer creditorsId;
	
	private Integer vendorId;

	private Integer bookingsId;

	private Integer billNo;

	private Double billAmount;

	private PaymentStatus paymentStatus;

	private PaymentMode paymentMode;

	private String remark;
}
