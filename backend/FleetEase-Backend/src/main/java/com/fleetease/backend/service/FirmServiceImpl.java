package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.FirmDto;
import com.fleetease.backend.exceptions.FirmException;
import com.fleetease.backend.model.Firm;
import com.fleetease.backend.repository.FirmRepo;

public class FirmServiceImpl implements FirmService{

	@Autowired
	private FirmRepo firmRepo;
	
	@Override
	public Firm addFirm(FirmDto firmDto) throws FirmException {

		Optional<Firm> optFirm = firmRepo.findByMobileNo(firmDto.getMobileNo());
		
		if(optFirm.isEmpty()) {
			
			Firm firm = new Firm();
			firm.setAddress(firmDto.getAddress());
			firm.setGstinNo(firmDto.getGstinNo());
			firm.setMobileNo(firmDto.getMobileNo());
			firm.setName(firmDto.getName());
			firm.setUserId(firmDto.getUserId());
			
			Firm savedFirm = firmRepo.save(firm);
			
			return savedFirm;
			
			
		} else {
			throw new FirmException("Firm is already created!");
		}
		
	}

	@Override
	public Firm getFirm(Integer firmId) throws FirmException {
		
		Optional<Firm> optFirm = firmRepo.findById(firmId);
		
		if(optFirm.isPresent()) {
			return optFirm.get();
		} else {
			throw new FirmException("Firm not exists!");
		}
		
	}

	@Override
	public String deleteFirm(Integer firmId) throws FirmException {

		Optional<Firm> optFirm = firmRepo.findById(firmId);
		
		if(optFirm.isPresent()) {
			firmRepo.delete(optFirm.get());
			return "Firm deleted succesfully.";
		} else {
			throw new FirmException("Firm not exists!");
		}
	}

	@Override
	public Firm updateFirm(Firm firm) throws FirmException {

		Optional<Firm> optFirm = firmRepo.findById(firm.getFirmId());
		
		if(optFirm.isPresent()) {
			Firm updatedFirm = firmRepo.save(firm);
			return updatedFirm;
		} else {
			throw new FirmException("Firm not exists!");
		}
	}

	@Override
	public List<Firm> getAllFirm() throws FirmException {
		
		List<Firm> firms = firmRepo.findAll();
		
		if(!firms.isEmpty()) {
			return firms;
		} else {
			throw new FirmException("There is no firm exists!");
		}
		
	}

}
