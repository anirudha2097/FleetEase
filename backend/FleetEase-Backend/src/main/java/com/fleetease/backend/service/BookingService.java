package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.dto.BookingDto;
import com.fleetease.backend.exceptions.BookingException;
import com.fleetease.backend.model.Booking;

public interface BookingService {

	public Booking addBooking(BookingDto bookingDto) throws BookingException;
	
	public Booking getBooking(Integer bookingId) throws BookingException;
	
	public String deleteBooking(Integer bookingId) throws BookingException;
	
	public Booking updateBooking(Booking booking) throws BookingException;
	
	public List<Booking> getAllBooking() throws BookingException;
	
	public List<Booking> getAllBookingByVendor(Integer vendorId) throws BookingException;
	
} 
