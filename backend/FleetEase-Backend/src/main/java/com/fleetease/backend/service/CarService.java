package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.dto.CarDto;
import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.exceptions.CarException;
import com.fleetease.backend.model.CabOwner;
import com.fleetease.backend.model.Car;

public interface CarService {

	public Car addCar(CarDto carDto) throws CarException;
	
	public Car updateCar(Car car) throws CarException;
	
	public String deleteCar(Integer carId) throws CarException;
	
	public Car getCar(Integer carId);
	
	public Car getCarByRegistrationNo(String registrationNo) throws CarException;
	
	public List<Car> getAllCars() throws CarException;
	
	public List<Car> getAllCarsByType(CabType cabType) throws CarException;
	
	public List<Car> getAllCarsByCabOwner(CabOwner cabOwner) throws CarException;
}
