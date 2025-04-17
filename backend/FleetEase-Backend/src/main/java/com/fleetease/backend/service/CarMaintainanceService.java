package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.dto.CarMaintainanceDto;
import com.fleetease.backend.exceptions.CarMaintainanceException;
import com.fleetease.backend.model.CarMaintainance;

public interface CarMaintainanceService {

	public CarMaintainance addCarMaintainance(CarMaintainanceDto carMaintainanceDto) throws CarMaintainanceException;
	
	public CarMaintainance getCarMaintainance(Long carMaintainanceId) throws CarMaintainanceException;
	
	public String deleteCarMaintainance(Long carMaintainanceId) throws CarMaintainanceException;
	
	public CarMaintainance updateCarMaintainance(CarMaintainance carMaintainance) throws CarMaintainanceException;

	public List<CarMaintainance> getAllCarMaintainance() throws CarMaintainanceException;
	
	public List<CarMaintainance> getAllCarMaintainanceByRegistrationNo(String registrationNo) throws CarMaintainanceException;
}

