package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.BookingException;

public interface BookingService {

	public BookingService addBooking(BookingService booking) throws BookingException;
	
	public BookingService getBooking(Integer bookingId) throws BookingException;
	
	public String deleteBooking(Integer bookingId) throws BookingException;
	
	public BookingService updateBooking(Integer bookingId, BookingService booking) throws BookingException;
	
	public List<BookingService> getAllBooking() throws BookingException;
	
	public List<BookingService> getAllBookingByVendor(Integer vendorId) throws BookingException;
	
} 
