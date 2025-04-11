package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.CarRecordDto;
import com.fleetease.backend.exceptions.CarRecordException;
import com.fleetease.backend.model.Car;
import com.fleetease.backend.model.CarRecord;
import com.fleetease.backend.repository.CarRecordRepo;

public class CarRecordServiceImpl implements CarRecordService {

	@Autowired
	private CarRecordRepo carRecordRepo;
	
	@Override
	public CarRecord addCarRecord(CarRecordDto carRecordDto) throws CarRecordException {
		// TODO Auto-generated method stub
		Optional<CarRecord> optCarRecord = carRecordRepo.findByBookingId(carRecordDto.getBookingId());
		
		if(optCarRecord.isEmpty()) {
			CarRecord carRecord = new CarRecord();
			carRecord.setCar(carRecordDto.getCar());
			carRecord.setCarMaintainance(carRecordDto.getCarMaintainance());
			carRecord.setBookingId(carRecordDto.getBookingId());
			carRecord.setDutyslipId(carRecordDto.getDutyslipId());
			carRecord.setFuelEfficiency(carRecordDto.getFuelEfficiency());
			carRecord.setFuelTopupAmount(carRecordDto.getFuelTopupAmount());
			carRecord.setFuelTopupInLitre(carRecordDto.getFuelTopupInLitre());
			carRecord.setFuelTopupKilometer(carRecordDto.getFuelTopupKilometer());
			carRecord.setGuestId(carRecordDto.getGuestId());
			carRecord.setProfit(carRecordDto.getProfit());
			carRecord.setRoute(carRecordDto.getRoute());
			carRecord.setTotalBillAmount(carRecordDto.getTotalBillAmount());
			carRecord.setTotalKilometer(carRecordDto.getTotalKilometer());
			
			CarRecord savedCarRecord = carRecordRepo.save(carRecord);
			
			if(savedCarRecord!=null) {
				return savedCarRecord;
			} else {
				throw new CarRecordException("Car record not saved!");
			}
			
		} else {
			throw new CarRecordException("Car record already added!");
		}
		
	}

	@Override
	public CarRecord getCarRecord(Integer carRecordId) throws CarRecordException {
		
		Optional<CarRecord> optCarRecord = carRecordRepo.findById(carRecordId);
		
		if(optCarRecord.isPresent()) {
			return optCarRecord.get();
		} else {
			throw new CarRecordException("Car record not found!");
		} 
		
	}

	@Override
	public CarRecord updateCarRecord(CarRecord carRecord) throws CarRecordException {
		// TODO Auto-generated method stub
		
		Optional<CarRecord> optCarRecord = carRecordRepo.findById(carRecord.getCarRecordId());
		
		if(optCarRecord.isPresent()) {
			CarRecord updatedCarRecord = carRecordRepo.save(carRecord);
			
			if(updatedCarRecord!=null) {
				return updatedCarRecord;
			} else {
				throw new CarRecordException("Car record not updated.");
			}
		} else {
			throw new CarRecordException("Car record not found!");
		} 

	}

	@Override
	public String deleteCarRecord(Integer carRecordId) throws CarRecordException {
		
		Optional<CarRecord> optCarRecord = carRecordRepo.findById(carRecordId);
		
		if(optCarRecord.isPresent()) {
			carRecordRepo.delete(optCarRecord.get());
			return "Car record deleted succesfully.";
		} else {
			throw new CarRecordException("Car record not found!");
		} 
		
	}

	@Override
	public List<CarRecord> getAllCarRecord() throws CarRecordException {
		// TODO Auto-generated method stub
		
		List<CarRecord> carRecords = carRecordRepo.findAll();
		
		if(!carRecords.isEmpty()) {
			return carRecords;
		} else {
			throw new CarRecordException("Car records not found!");
		}

	}

	@Override
	public List<CarRecord> getAllCarRecordByRegistrationNo(Car car) throws CarRecordException {
		// TODO Auto-generated method stub
		List<CarRecord> carRecords = carRecordRepo.findByCar(car);
		
		if(!carRecords.isEmpty()) {
			return carRecords;
		} else {
			throw new CarRecordException("Car records not found!");
		}
		
	}

}
