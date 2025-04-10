package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.CarMaintainanceDto;
import com.fleetease.backend.exceptions.CarMaintainanceException;
import com.fleetease.backend.model.Car;
import com.fleetease.backend.model.CarMaintainance;
import com.fleetease.backend.repository.CarMaintainanceRepo;
import com.fleetease.backend.repository.CarRepo;

public class CarMaintainanceServiceImpl implements CarMaintainanceService {

	@Autowired
	private CarMaintainanceRepo carMaintainanceRepo;
	
	@Autowired
	private CarRepo carRepo;

	
	@Override
	public CarMaintainance addCarMaintainance(CarMaintainanceDto carMaintainanceDto) throws CarMaintainanceException {
		
		CarMaintainance carMaintainance = new CarMaintainance();
		carMaintainance.setCar(carMaintainanceDto.getCar());
		carMaintainance.setMaintainanceDescription(carMaintainanceDto.getMaintainanceDescription());
		carMaintainance.setMaintainanceDate(carMaintainanceDto.getMaintainanceDate());
		carMaintainance.setMaintainanceKilometer(carMaintainanceDto.getMaintainanceKilometer());
		carMaintainance.setNextScheduleMaintainanceKilometer(carMaintainanceDto.getNextScheduleMaintainanceKilometer());
		carMaintainance.setTotalBillAmount(carMaintainanceDto.getTotalBillAmount());
		carMaintainance.setTotalRunningKilometer(carMaintainanceDto.getTotalRunningKilometer());
		
		CarMaintainance addedCarMaintainance = carMaintainanceRepo.save(carMaintainance);
		
		if(addedCarMaintainance!=null) {
			return addedCarMaintainance;
		} else {
			throw new CarMaintainanceException("Maintainance not added!");
		}
	}

	@Override
	public CarMaintainance getCarMaintainance(Integer carMaintainanceId) throws CarMaintainanceException {
		
		Optional<CarMaintainance> optCarMaintainance = carMaintainanceRepo.findById(carMaintainanceId);
		
		if(optCarMaintainance.isPresent()) {
			return optCarMaintainance.get();
		} else {
			throw new CarMaintainanceException("Maintainance not found!");
		}
				
	}

	@Override
	public String deleteCarMaintainance(Integer carMaintainanceId) throws CarMaintainanceException {
		// TODO Auto-generated method stub
		
		Optional<CarMaintainance> optCarMaintainance = carMaintainanceRepo.findById(carMaintainanceId);
		
		if(optCarMaintainance.isPresent()) {
			
			carMaintainanceRepo.delete(optCarMaintainance.get());
			
			return "Maintainance deleted succesfully.";
		} else {
			throw new CarMaintainanceException("Maintainance not found!");
		}
		
	}

	@Override
	public CarMaintainance updateCarMaintainance(CarMaintainance carMaintainance) throws CarMaintainanceException {

		Optional<CarMaintainance> optCarMaintainance = carMaintainanceRepo.findById(carMaintainance.getCarMaintainanceId());
		
		if(optCarMaintainance.isPresent()) {
			
			CarMaintainance updatedCarMaintainance = carMaintainanceRepo.save(carMaintainance);
			
			return updatedCarMaintainance;
			
		} else {
			throw new CarMaintainanceException("Maintainance not found!");
		}
		
	}

	@Override
	public List<CarMaintainance> getAllCarMaintainance() throws CarMaintainanceException {
		// TODO Auto-generated method stub
		
		List<CarMaintainance> allCarMaintainance = carMaintainanceRepo.findAll();
		
		if(!allCarMaintainance.isEmpty()) {
			return allCarMaintainance;
		} else {
			throw new CarMaintainanceException("There is no car maintainance available.");
		}
		
	}

	@Override
	public List<CarMaintainance> getAllCarMaintainanceByRegistrationNo(String registrationNo) throws CarMaintainanceException {

		Car car = carRepo.findByRegistrationNo(registrationNo);
		
		
		if(car!=null) {
			List<CarMaintainance> allCarMaintainance = carMaintainanceRepo.findByCar(car);
			
			if(!allCarMaintainance.isEmpty()) {
				return allCarMaintainance;
			} else {
				throw new CarMaintainanceException("Maintainance not found for this car!");
			}
			
		} else {
			throw new CarMaintainanceException("Cab not found!");
		}
				
	}

}
