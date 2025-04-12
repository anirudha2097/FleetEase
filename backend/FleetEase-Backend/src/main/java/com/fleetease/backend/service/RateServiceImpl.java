package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.RateDto;
import com.fleetease.backend.exceptions.RateException;
import com.fleetease.backend.model.Rate;
import com.fleetease.backend.repository.RateRepo;

public class RateServiceImpl implements RateService {

	@Autowired
	private RateRepo rateRepo;
	
	@Override
	public Rate addRate(RateDto rateDto) throws RateException {
		
		Optional<Rate> optRate = rateRepo.findByRatePersonAndRatePersonId(rateDto.getRatePerson(), rateDto.getRatePersonId());
		
		if(optRate.isEmpty()) {
			
			Rate rate = new Rate();
			
			rate.setPremiumSedanRate(rateDto.getPremiumSedanRate());
			rate.setPremiumSuvRate(rateDto.getPremiumSuvRate());
			rate.setRatePerson(rateDto.getRatePerson());
			rate.setRatePersonId(rateDto.getRatePersonId());
			rate.setSedanRate(rateDto.getSedanRate());
			rate.setSuvRate(rateDto.getSuvRate());
			
			Rate savedRate = rateRepo.save(rate);
			
			return savedRate;
		} else {
			throw new RateException("Rate is already exist for this person.");
		}
		
	}

	@Override
	public Rate getRate(Integer rateId) throws RateException {
	
		Optional<Rate> optRate = rateRepo.findById(rateId);
		
		if(optRate.isPresent()) {
			return optRate.get();
		} else {
			throw new RateException("Rate not exist!");
		}
		
	}

	@Override
	public String deleteRate(Integer rateId) throws RateException {

		Optional<Rate> optRate = rateRepo.findById(rateId);
		
		if(optRate.isPresent()) {
			rateRepo.delete(optRate.get());
			return "Rate deleted successfully!";
		} else {
			throw new RateException("Rate not exist!");
		}
		
	}

	@Override
	public Rate updateRate(Rate rate) throws RateException {

		Optional<Rate> optRate = rateRepo.findById(rate.getRateId());
		
		if(optRate.isPresent()) {
			Rate updatedRate = rateRepo.save(rate);
			return updatedRate;
		} else {
			throw new RateException("Rate not exist!");
		}
		
	}

	@Override
	public List<Rate> getAllRate() throws RateException {
		
		List<Rate> rates = rateRepo.findAll();
		
		if(!rates.isEmpty()) {
			return rates;
		} else {
			throw new RateException("There is no rates found!");
		}
	}

}
