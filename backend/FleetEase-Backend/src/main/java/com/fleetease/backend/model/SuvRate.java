package com.fleetease.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuvRate {

	private Integer PerKmRate;

	private Integer PerHrsRate;

	private Integer TransferPackageRate;

	private Integer LocalPackageRate;

	private Integer DayPackageRate;

	private Integer DriverDailyAllowance;
}
