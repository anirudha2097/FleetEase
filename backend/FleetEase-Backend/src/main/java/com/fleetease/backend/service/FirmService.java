package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.FirmException;
import com.fleetease.backend.model.Firm;

public interface FirmService {

	public Firm addFirm(Firm firm) throws FirmException;
	
	public Firm getFirm(Integer firmId) throws FirmException;
	
	public String deleteFirm(Integer firmId) throws FirmException;
	
	public Firm updateFirm(Integer firmId, Firm firm) throws FirmException;
	
	public List<Firm> getAllFirm() throws FirmException;
	
}
