package com.fleetease.backend.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.enums.DutyType;
import com.fleetease.backend.enums.Status;
import com.fleetease.backend.model.Guest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {

	private Integer vendorId;

	private LocalDateTime bookingDate;

	private Guest guest;

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
