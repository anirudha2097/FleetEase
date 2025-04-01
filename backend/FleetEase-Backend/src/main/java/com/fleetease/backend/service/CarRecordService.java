package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.CarRecordException;
import com.fleetease.backend.model.CarRecord;

public interface CarRecordService {

	public CarRecord addCarRecord(CarRecord carRecord) throws CarRecordException;
	
	public CarRecord getCarRecord(Integer carRecordId) throws CarRecordException;
	
	public CarRecord updateCarRecord(Integer carRecordId, CarRecord carRecord) throws CarRecordException;

	public String deleteCarRecord(Integer carRecordId) throws CarRecordException;
	
	public List<CarRecord> getAllCarRecord() throws CarRecordException;
	
	public List<CarRecord> getAllCarRecordByRegistrationNo(String registrationNo) throws CarRecordException;
	
}
