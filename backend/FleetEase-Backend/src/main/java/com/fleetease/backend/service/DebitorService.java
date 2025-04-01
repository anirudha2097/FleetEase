package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.DebitorException;
import com.fleetease.backend.model.Debitor;

public interface DebitorService {

	public Debitor addDebitor(Debitor debitor) throws DebitorException;
	
	public Debitor getDebitor(Integer debitorId) throws DebitorException;
	
	public String deleteDebitor(Integer debitorId) throws DebitorException;
	
	public Debitor updateDebitor(Integer debitorId, Debitor debitor) throws DebitorException;
	
	public List<Debitor> getAllDebitor() throws DebitorException;
}
