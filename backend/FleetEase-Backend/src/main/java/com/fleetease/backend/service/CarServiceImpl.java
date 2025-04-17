package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.CarDto;
import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.exceptions.CarException;
import com.fleetease.backend.model.CabOwner;
import com.fleetease.backend.model.Car;
import com.fleetease.backend.repository.CarRepo;

public class CarServiceImpl implements CarService {


	@Autowired
	private CarRepo carRepo;
	
	@Override
	public Car addCar(CarDto carDto) throws CarException {
		// TODO Auto-generated method stub
		Car car = carRepo.findByRegistrationNo(carDto.getRegistrationNo());
		
		if(car==null) {
			Car carEntity = new Car();
			carEntity.setCabType(carDto.getCabType());
			carEntity.setCabOwner(carDto.getCabOwnerId());
			carEntity.setManufacturer(carDto.getManufacturer());
			carEntity.setModelName(carDto.getModelName());
			carEntity.setRegistrationNo(carDto.getRegistrationNo());
			carEntity.setRegistrationYear(carDto.getRegistrationYear());
			
			Car savedCar = carRepo.save(carEntity);
			
			if(savedCar!=null) {
				return savedCar;				
			} else {
				throw new CarException("Car not saved!");
			}
		} else {
			throw new CarException("Car already present with this registration no.");
		}
		
	}

	@Override
	public Car updateCar(Car car) throws CarException {
		// TODO Auto-generated method stub
		Optional<Car> optCar = carRepo.findById(car.getCarId());
		
		if(optCar.isPresent()) {
			Car updatedCar = carRepo.save(car);
			return updatedCar;
		} else {
			throw new CarException("Car not available!");
		}
		
	}

	@Override
	public String deleteCar(Integer carId) throws CarException {
		// TODO Auto-generated method stub
		
		Optional<Car> optCar = carRepo.findById(carId);
		
		if(optCar.isPresent()) {
			carRepo.delete(optCar.get());
			return "Car deleted succesfully.";
		} else {
			throw new CarException("Car not available!");
		}

	}

	@Override
	public Car getCar(Integer carId) {
		// TODO Auto-generated method stub
		
		Optional<Car> optCar = carRepo.findById(carId);
		
		if(optCar.isPresent()) {
			return optCar.get();
		} else {
			throw new CarException("Car not available!");
		}

	}

	@Override
	public Car getCarByRegistrationNo(String registrationNo) throws CarException {
		// TODO Auto-generated method stub
		
		Car car = carRepo.findByRegistrationNo(registrationNo);
		
		if(car!=null) {
			return car;
		} else {
			throw new CarException("Car not available with this registration no.");
		}

	}

	@Override
	public List<Car> getAllCars() throws CarException {
		// TODO Auto-generated method stub
		
		List<Car> cars = carRepo.findAll();
		
		if(!cars.isEmpty()) {
			return cars;
		} else {
			throw new CarException("There no car found!");
		}

	}

	@Override
	public List<Car> getAllCarsByType(CabType cabType) throws CarException {
		// TODO Auto-generated method stub
		
		List<Car> cars = carRepo.findByCabType(cabType);
		
		if(!cars.isEmpty()) {
			return cars;
		} else {
			throw new CarException("There no car found with this cab type!");
		}

	}

	@Override
	public List<Car> getAllCarsByCabOwner(Integer cabOwnerId) throws CarException {
		// TODO Auto-generated method stub
		
		List<Car> cars = carRepo.findByCabOwnerId(cabOwnerId);
		
		if(!cars.isEmpty()) {
			return cars;
		} else {
			throw new CarException("There no car found with this cab type!");
		}

	}

}
