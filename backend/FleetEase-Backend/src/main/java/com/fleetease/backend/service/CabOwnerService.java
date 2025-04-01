package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.CabOwnerException;
import com.fleetease.backend.model.CabOwner;

public interface CabOwnerService {

	public CabOwner addCabOwner(CabOwner cabOwner) throws CabOwnerException;
	
	public CabOwner getCabOwner(Integer cabOwnerId) throws CabOwnerException;
	
	public String deleteCabOwner(Integer cabOwnerId) throws CabOwnerException;
	
	public CabOwner updateCabOwner(Integer cabOwnerId, CabOwner cabOwner) throws CabOwnerException;
	
	public List<CabOwner> getAllCabOwner() throws CabOwnerException;
	
}
