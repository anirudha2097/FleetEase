package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.VendorDto;
import com.fleetease.backend.exceptions.VendorException;
import com.fleetease.backend.model.Vendor;
import com.fleetease.backend.repository.VendorRepo;

public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepo vendorRepo;

	@Override
	public Vendor addVendor(VendorDto vendorDto) throws VendorException {
		// TODO Auto-generated method stub
		Optional<Vendor> optVendor = vendorRepo.findByMobileNo(vendorDto.getMobileNo());
		
		if(optVendor.isEmpty()) {
			Vendor vendor = new Vendor();
			vendor.setAddress(vendorDto.getAddress());
			vendor.setGstinNo(vendor.getGstinNo());
			vendor.setMobileNo(vendor.getMobileNo());
			vendor.setName(vendor.getName());
			vendor.setRate(vendor.getRate());
			
			Vendor savedVendor = vendorRepo.save(vendor);
			return savedVendor;
		} else {
			throw new VendorException("Vendor already exist!");
		}

	}

	@Override
	public Vendor getVendor(Integer vendorId) throws VendorException {
		// TODO Auto-generated method stub
		Optional<Vendor> optVendor = vendorRepo.findById(vendorId);
		
		if(optVendor.isPresent()) {
			return optVendor.get();
		} else {
			throw new VendorException("Vendor not available!");
		}
		
	}

	@Override
	public String deleteVendor(Integer vendorId) throws VendorException {
		// TODO Auto-generated method stub
		
		Optional<Vendor> optVendor = vendorRepo.findById(vendorId);
		
		if(optVendor.isPresent()) {
			vendorRepo.delete(optVendor.get());
			return "Vendor deleted succesfully!";
		} else {
			throw new VendorException("Vendor not available!");
		}

	}

	@Override
	public Vendor updateVendor(Vendor vendor) throws VendorException {
		
		Optional<Vendor> optVendor = vendorRepo.findById(vendor.getVendorId());
		
		if(optVendor.isPresent()) {
			Vendor updatedVendor = vendorRepo.save(vendor);
			return updatedVendor;
		} else {
			throw new VendorException("Vendor not available!");
		}
	}

	@Override
	public List<Vendor> getAllVendor() throws VendorException {
		
		List<Vendor> vendors = vendorRepo.findAll();
		
		if(!vendors.isEmpty()) {
			return vendors;
		} else {
			throw new VendorException("There is no Vendor available!");
		}
		
	}

}
