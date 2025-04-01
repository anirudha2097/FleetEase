package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.CreditorException;
import com.fleetease.backend.model.Creditor;

public interface CreditorService {

	public Creditor addCreditor(Creditor creditor) throws CreditorException;
	
	public Creditor getCreditor(Integer creditorId) throws CreditorException;
	
	public String deleteCreditor(Integer creditorId) throws CreditorException;
	
	public Creditor updateCreditor(Integer creditorId, Creditor creditor) throws CreditorException;
	
	public List<Creditor> getAllCreditor() throws CreditorException;
	
}
