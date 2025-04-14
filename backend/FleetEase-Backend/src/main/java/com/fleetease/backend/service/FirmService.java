package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.dto.FirmDto;
import com.fleetease.backend.exceptions.FirmException;
import com.fleetease.backend.model.Firm;

public interface FirmService {

	public Firm addFirm(FirmDto firmDto) throws FirmException;
	
	public Firm getFirm(Integer firmId) throws FirmException;
	
	public String deleteFirm(Integer firmId) throws FirmException;
	
	public Firm updateFirm(Firm firm) throws FirmException;
	
	public List<Firm> getAllFirm() throws FirmException;
	
}
