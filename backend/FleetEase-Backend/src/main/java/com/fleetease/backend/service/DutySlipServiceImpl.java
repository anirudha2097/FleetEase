package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.DutySlipDto;
import com.fleetease.backend.exceptions.DutySlipException;
import com.fleetease.backend.model.DutySlip;
import com.fleetease.backend.repository.DutySlipRepo;

public class DutySlipServiceImpl implements DutySlipService{

	@Autowired
	private DutySlipRepo dutySlipRepo;
	
	@Override
	public DutySlip addDutySlip(DutySlipDto dutySlipDto) throws DutySlipException {
		// TODO Auto-generated method stub
		Optional<DutySlip> optDutySlip = dutySlipRepo.findByBookingId(dutySlipDto.getBookingId());
		
		if(optDutySlip.isEmpty()) {
		
			DutySlip dutySlip = new DutySlip();
			dutySlip.setActualDaysOfTrip(dutySlipDto.getActualDaysOfTrip());
			dutySlip.setAdvanceAmountToCabOwner(dutySlipDto.getAdvanceAmountToCabOwner());
			dutySlip.setBillingKilometer(dutySlipDto.getBillingKilometer());
			dutySlip.setCar(dutySlipDto.getCar());
			dutySlip.setDutySlipNo(dutySlipDto.getDutySlipNo());
			dutySlip.setEndDateAndTime(dutySlipDto.getEndDateAndTime());
			dutySlip.setEndKilometer(dutySlipDto.getEndKilometer());
			dutySlip.setCabOwner(dutySlipDto.getCabOwner());
			dutySlip.setParkingAmount(dutySlipDto.getParkingAmount());
			dutySlip.setPaymentModeToCabOwner(dutySlipDto.getPaymentModeToCabOwner());
			dutySlip.setRatePerKilometer(dutySlipDto.getRatePerKilometer());
			dutySlip.setRemainingPaymentToCabOwner(dutySlipDto.getRemainingPaymentToCabOwner());
			dutySlip.setRemark(dutySlipDto.getRemark());
			dutySlip.setRoute(dutySlipDto.getRoute());
			dutySlip.setStartDateAndTime(dutySlipDto.getStartDateAndTime());
			dutySlip.setStartKilometer(dutySlipDto.getStartKilometer());
			dutySlip.setTotalBillAmountReceiving(dutySlipDto.getTotalBillAmountReceiving());
			dutySlip.setTotalBillAmountToCabOwner(dutySlipDto.getTotalBillAmountToCabOwner());
			dutySlip.setTotalTollAmount(dutySlipDto.getTotalTollAmount());
			dutySlip.setTotalTripKilometer(dutySlipDto.getTotalTripKilometer());
			
			DutySlip savedDutySlip = dutySlipRepo.save(dutySlip);
			
			return savedDutySlip;
			
		} else {
			throw new DutySlipException("DutySlip alreadt exists!");
		}
		
	}

	@Override
	public DutySlip getDutySlip(Integer dutySlipId) throws DutySlipException {
		
		Optional<DutySlip> optDutySlip = dutySlipRepo.findById(dutySlipId);
		
		if(optDutySlip.isPresent()) {
			return optDutySlip.get();
		} else {
			throw new DutySlipException("DutySlip not available!");
		}

	}

	@Override
	public String deleteDutySlip(Integer dutySlipId) throws DutySlipException {

		Optional<DutySlip> optDutySlip = dutySlipRepo.findById(dutySlipId);
		
		if(optDutySlip.isPresent()) {
			dutySlipRepo.delete(optDutySlip.get());
			return "DutySlip deleted succesfully!";
		} else {
			throw new DutySlipException("DutySlip not available!");
		}
	}

	@Override
	public DutySlip updateDutySlip(DutySlip dutySlip) throws DutySlipException {

		Optional<DutySlip> optDutySlip = dutySlipRepo.findById(dutySlip.getDutySlipId());
		
		if(optDutySlip.isPresent()) {
			DutySlip updatedDutySlip = dutySlipRepo.save(dutySlip);
			return updatedDutySlip;
		} else {
			throw new DutySlipException("DutySlip not available!");
		}

	}

	@Override
	public List<DutySlip> getAllDutySlip() throws DutySlipException {

		List<DutySlip> dutySlips = dutySlipRepo.findAll();
		
		if(!dutySlips.isEmpty()) {
			return dutySlips;
		} else {
			throw new DutySlipException("There is no dutySlip not available!");
		}
		
	}

	@Override
	public List<DutySlip> getAllDutySlipByVendor(Integer vendorId) throws DutySlipException {
		
		return null;
	}

	
}
