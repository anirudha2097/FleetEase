package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.CarMaintainanceException;
import com.fleetease.backend.model.CarMaintainance;

public interface CarMaintainanceService {

	public CarMaintainance addCarMaintainance(CarMaintainance carMaintainance) throws CarMaintainanceException;
	
	public CarMaintainance getCarMaintainance(Integer carMaintainanceId) throws CarMaintainanceException;
	
	public String deleteCarMaintainance(Integer carMaintainanceId) throws CarMaintainanceException;
	
	public CarMaintainance updateCarMaintainance(Integer carMaintainanceId, CarMaintainance carMaintainance) throws CarMaintainanceException;

	public List<CarMaintainance> getAllCarMaintainance() throws CarMaintainanceException;
	
	public List<CarMaintainance> getAllCarMaintainanceByRegistrationNo(String registrationNo) throws CarMaintainanceException;
}

