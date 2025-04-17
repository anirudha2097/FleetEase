package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.CreditorException;
import com.fleetease.backend.model.Bill;
import com.fleetease.backend.model.DutySlip;

public interface CreditorService {

//	public Creditor addCreditor(Creditor creditor) throws CreditorException;
//	
//	public Creditor getCreditor(Integer creditorId) throws CreditorException;
//	
//	public String deleteCreditor(Integer creditorId) throws CreditorException;
//	
//	public Creditor updateCreditor(Integer creditorId, Creditor creditor) throws CreditorException;
//	
//	public List<Creditor> getAllCreditor() throws CreditorException;
//	
	public Bill insertBillToCreditorList(DutySlip dutySlip) throws CreditorException;
	
	public String deleteBillFromCreditorList(Integer billNo) throws CreditorException;
	
	public Bill updateBill(DutySlip dutySlip) throws CreditorException;
	
	public List<Bill> showCreditorStatement(Integer creditorId) throws CreditorException;
	
	
}
