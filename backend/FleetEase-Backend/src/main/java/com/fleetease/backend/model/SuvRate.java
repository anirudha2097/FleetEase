package com.fleetease.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class SuvRate {

	@Column(name="per_km_rate", insertable=false, updatable=false)
	private Integer PerKmRate;
	
	@Column(name="per_hrs_rate", insertable=false, updatable=false)
	private Integer PerHrsRate;

	@Column(name="transfer_package_rate", insertable=false, updatable=false)
	private Integer TransferPackageRate;

	@Column(name="local_package_rate", insertable=false, updatable=false)
	private Integer LocalPackageRate;

	@Column(name="day_package_rate", insertable=false, updatable=false)
	private Integer DayPackageRate;

	@Column(name="driver_daily_allowance", insertable=false, updatable=false)
	private Integer DriverDailyAllowance;
}
