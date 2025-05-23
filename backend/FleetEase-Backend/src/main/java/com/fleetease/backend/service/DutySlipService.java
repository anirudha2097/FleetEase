package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.dto.DutySlipDto;
import com.fleetease.backend.exceptions.DutySlipException;
import com.fleetease.backend.model.DutySlip;

public interface DutySlipService {

	public DutySlip addDutySlip(DutySlipDto dutySlipDto) throws DutySlipException;
	
	public DutySlip getDutySlip(Integer dutySlipId) throws DutySlipException;
	
	public String deleteDutySlip(Integer dutySlipId) throws DutySlipException;
	
	public DutySlip updateDutySlip(DutySlip dutySlip) throws DutySlipException;
	
	public List<DutySlip> getAllDutySlip() throws DutySlipException;
	
	public List<DutySlip> getAllDutySlipByVendor(Integer vendorId) throws DutySlipException;
}
