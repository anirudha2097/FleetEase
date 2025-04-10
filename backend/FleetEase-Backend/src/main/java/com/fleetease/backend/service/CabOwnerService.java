package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.dto.CabOwnerDto;
import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.exceptions.CabOwnerException;
import com.fleetease.backend.model.CabOwner;
import com.fleetease.backend.model.Car;

public interface CabOwnerService {

	public CabOwner addCabOwner(CabOwnerDto cabOwnerDto) throws CabOwnerException;
	
	public CabOwner getCabOwner(Integer cabOwnerId) throws CabOwnerException;
	
	public String deleteCabOwner(Integer cabOwnerId) throws CabOwnerException;
	
	public CabOwner updateCabOwner(CabOwner cabOwner) throws CabOwnerException;
	
	public List<CabOwner> getAllCabOwner() throws CabOwnerException;
	
	public CabOwner addVehicleToCabOwner(Integer cabOwnerId, Car car) throws CabOwnerException;
	
	public CabOwner removeVehicleFromCabOwner(Integer cabOwnerId, Car car) throws CabOwnerException;
	
	public List<CabOwner> getCabOwnerByCabType(CabType cabType) throws CabOwnerException;
}
