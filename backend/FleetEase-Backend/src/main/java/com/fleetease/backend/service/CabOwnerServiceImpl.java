package com.fleetease.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.CabOwnerDto;
import com.fleetease.backend.enums.CabType;
import com.fleetease.backend.exceptions.CabOwnerException;
import com.fleetease.backend.model.CabOwner;
import com.fleetease.backend.model.Car;
import com.fleetease.backend.repository.CabOwnerRepo;

public class CabOwnerServiceImpl implements CabOwnerService {

	@Autowired
	private CabOwnerRepo cabOwnerRepo;
	
	@Override
	public CabOwner addCabOwner(CabOwnerDto cabOwnerDto) throws CabOwnerException {

		CabOwner existingCabOwner = cabOwnerRepo.findByMobileNo(cabOwnerDto.getMobileNo());
		
		if(existingCabOwner == null) {
			CabOwner cabOwner = new CabOwner();
			cabOwner.setAddress(cabOwnerDto.getAddress());
			cabOwner.setCabOwnerName(cabOwnerDto.getCabOwnerName());
			cabOwner.setMobileNo(cabOwnerDto.getMobileNo());
			cabOwner.setCabs(cabOwnerDto.getCabs());
			
			CabOwner savedCabOwner = cabOwnerRepo.save(cabOwner);
			
			if(savedCabOwner!=null) {
				return savedCabOwner;
			} else {
				throw new CabOwnerException("Cab owner not saved!");
			}
		} else {
			throw new CabOwnerException("Cab owner is already exist or mobile no is connected with another cab owner!");
		}
		
	}
	
	@Override
	public CabOwner getCabOwner(Integer cabOwnerId) throws CabOwnerException {

		Optional<CabOwner> optCabOwner = cabOwnerRepo.findById(cabOwnerId);
		
		if(optCabOwner.isPresent()) {
			return optCabOwner.get();
		} else {
			throw new CabOwnerException("Cab owner not found!");
		}
		
	}

	@Override
	public String deleteCabOwner(Integer cabOwnerId) throws CabOwnerException {

		Optional<CabOwner> optCabOwner = cabOwnerRepo.findById(cabOwnerId);
		
		if(optCabOwner.isPresent()) {
			cabOwnerRepo.delete(optCabOwner.get());
			return "Cab owner deleted succesfully.";
		} else {
			throw new CabOwnerException("Cab owner not found!");
		}

	}
	
	@Override
	public CabOwner updateCabOwner(CabOwner cabOwner) throws CabOwnerException {
		
		Optional<CabOwner> optCabOwner = cabOwnerRepo.findById(cabOwner.getCabOwnerId());
		
		if(optCabOwner.isPresent()) {
					
			CabOwner updatedCabOwner = cabOwnerRepo.save(cabOwner);
			
			if(updatedCabOwner!=null) {
				return updatedCabOwner;
			} else {
				throw new CabOwnerException("Cab owner not updated!");
			}
		} else {
			throw new CabOwnerException("Cab owner not found!");
		}
		
	}
	
	@Override
	public List<CabOwner> getAllCabOwner() throws CabOwnerException {

		List<CabOwner> cabOwners = cabOwnerRepo.findAll();
		
		if(!cabOwners.isEmpty()) {
			return cabOwners;
		} else {
			throw new CabOwnerException("There is no cab owners not available.");
		}
		
	}

	@Override
	public CabOwner addVehicleToCabOwner(Integer cabOwnerId, Car car) throws CabOwnerException {

		Optional<CabOwner> optCabOwner = cabOwnerRepo.findById(cabOwnerId);
		
		if(optCabOwner.isPresent()) {
			CabOwner cabOwner = optCabOwner.get();
			cabOwner.getCabs().add(car);
			
			return cabOwnerRepo.save(cabOwner);
		} else {
			throw new CabOwnerException("Cab Owner not found!");
		}
	}

	@Override
	public CabOwner removeVehicleFromCabOwner(Integer cabOwnerId, Car car) throws CabOwnerException {
		
		Optional<CabOwner> optCabOwner = cabOwnerRepo.findById(cabOwnerId);
		
		if(optCabOwner.isPresent()) {
			CabOwner cabOwner = optCabOwner.get();
			cabOwner.getCabs().remove(car);
			
			return cabOwnerRepo.save(cabOwner);
		} else {
			throw new CabOwnerException("Cab Owner not found!");
		}
	}

	@Override
	public List<CabOwner> getCabOwnerByCabType(CabType cabType) throws CabOwnerException {

		List<CabOwner> cabOwners = cabOwnerRepo.findAll();
		
		if(!cabOwners.isEmpty()) {
			
			List<CabOwner> cabOwnersByCabType = new ArrayList<CabOwner>();
		
			for(CabOwner cabOwner : cabOwners) {
				
				if(cabOwner.getCabs().contains(cabType)) {
					cabOwnersByCabType.add(cabOwner);
				}else {
					continue;
				}
			}
			
			return cabOwnersByCabType;
			
		} else {
			throw new CabOwnerException("There is no cab owners not available.");
		}
	}

}
