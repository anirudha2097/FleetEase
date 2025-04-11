package com.fleetease.backend.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.enums.DutyType;
import com.fleetease.backend.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;

	private Integer vendorId;

	private LocalDateTime bookingDate;

	@ManyToOne
	@JoinColumn(name = "guest_id")
	private Guest guestId;

	private LocalDateTime pickupDateAndTime;

	private LocalDate dropDate;

	private Integer daysOfTrip;

	private String pickupPlace; 

	private String dropPlace;

	private String tentativeRoute;

	private DutyType dutyType;
	
	private CabType cabType;

	private Status status;
}
