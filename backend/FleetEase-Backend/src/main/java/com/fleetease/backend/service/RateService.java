package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.RateException;
import com.fleetease.backend.model.Rate;

public interface RateService {

	public Rate addRate(Rate rate) throws RateException;
	
	public Rate getRate(Integer rateId) throws RateException;
	
	public String deleteRate(Integer rateId) throws RateException;
	
	public Rate updateRate(Integer rateId, Rate rate) throws RateException;
	
	public List<Rate> getAllRate() throws RateException;
}
