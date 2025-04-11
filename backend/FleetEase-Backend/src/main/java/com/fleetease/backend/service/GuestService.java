package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.dto.GuestDto;
import com.fleetease.backend.exceptions.GuestException;
import com.fleetease.backend.model.Booking;
import com.fleetease.backend.model.Guest;

public interface GuestService {

	public Guest addGuest(GuestDto guestDto) throws GuestException;
	
	public Guest getGuestById(Integer guestId) throws GuestException;
	
	public Guest updateGuest(Guest guest) throws GuestException;
	
	public String deleteGuest(Integer guestId) throws GuestException;
	
	public List<Guest> getAllGuest() throws GuestException;
	
	public Guest getGuestByMobileNo(String mobileNo) throws GuestException;
	
	public List<Booking> getAllBookingByGuest(Guest guest) throws GuestException;
	
}
