package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.GuestDto;
import com.fleetease.backend.exceptions.GuestException;
import com.fleetease.backend.model.Booking;
import com.fleetease.backend.model.Guest;
import com.fleetease.backend.repository.GuestRepo;

public class GuestServiceImpl implements GuestService{

	@Autowired
	private GuestRepo guestRepo;
	
	@Override
	public Guest addGuest(GuestDto guestDto) throws GuestException {
		
		Optional<Guest> optGuest = guestRepo.findByMobileNo(guestDto.getMobileNo());
		
		if(optGuest.isEmpty()) {
			Guest guest = new Guest();
			guest.setMobileNo(guestDto.getMobileNo());
			guest.setName(guestDto.getName());
			
			Guest savedGuest = guestRepo.save(guest);
			return savedGuest;
		} else {
			throw new GuestException("Guest is already present!");
		}
		
	}

	@Override
	public Guest getGuestById(Integer guestId) throws GuestException {

		Optional<Guest> optGuest = guestRepo.findById(guestId);
		
		if(optGuest.isEmpty()) {
			return optGuest.get();
		} else {
			throw new GuestException("Guest is not available!");
		}

	}

	@Override
	public Guest updateGuest(Guest guest) throws GuestException {
		
		Optional<Guest> optGuest = guestRepo.findById(guest.getGuestId());
		
		if(optGuest.isPresent()) {
			Guest savedGuest = guestRepo.save(guest);
			return savedGuest;
		} else {
			throw new GuestException("Guest is not available!");
		}

	}

	@Override
	public String deleteGuest(Integer guestId) throws GuestException {

		Optional<Guest> optGuest = guestRepo.findById(guestId);
		
		if(optGuest.isPresent()) {
			guestRepo.delete(optGuest.get());
			return "Guest deleted succesfully.";
		} else {
			throw new GuestException("Guest is not available!");
		}

	}

	@Override
	public List<Guest> getAllGuest() throws GuestException {
		// TODO Auto-generated method stub
		
		List<Guest> guests = guestRepo.findAll();
		
		if(!guests.isEmpty()) {
			return guests;
		} else {
			throw new GuestException("There is no guests not avaiable");
		}
		
	}

	@Override
	public Guest getGuestByMobileNo(String mobileNo) throws GuestException {
		
		Optional<Guest> optGuest = guestRepo.findByMobileNo(mobileNo);
		
		if(optGuest.isEmpty()) {
			return optGuest.get();
		} else {
			throw new GuestException("Guest is not available!");
		}
		
	}

	@Override
	public List<Booking> getAllBookingByGuest(Guest guest) throws GuestException {
		
		Optional<Guest> optGuest = guestRepo.findByMobileNo(guest.getMobileNo());
		
		if(optGuest.isPresent()) {
			return optGuest.get().getBookings();
		} else {
			throw new GuestException("Bookings not found!");
		}

	}

	
}
