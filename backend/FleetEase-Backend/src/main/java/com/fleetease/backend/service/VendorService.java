package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.VendorException;
import com.fleetease.backend.model.Vendor;

public interface VendorService {

	public Vendor addVendor(Vendor vendor) throws VendorException;

	public Vendor getVendor(Integer vendorId) throws VendorException;
	
	public String deleteVendor(Integer vendorId) throws VendorException;
	
	public Vendor updateVendor(Integer vendorId, Vendor vendor) throws VendorException;
	
	public List<Vendor> getAllVendor() throws VendorException;
}

