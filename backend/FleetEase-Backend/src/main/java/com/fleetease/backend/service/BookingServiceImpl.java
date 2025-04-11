package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.BookingDto;
import com.fleetease.backend.exceptions.BookingException;
import com.fleetease.backend.model.Booking;
import com.fleetease.backend.model.Guest;
import com.fleetease.backend.repository.BookingRepo;
import com.fleetease.backend.repository.GuestRepo;

public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepo bookingRepo;
	
	@Autowired
	private GuestRepo guestRepo;
	
	@Override
	public Booking addBooking(BookingDto bookingDto) throws BookingException {
		
		Optional<Guest> optGuest = guestRepo.findByMobileNo(bookingDto.getGuest().getMobileNo());
		
		Booking booking = new Booking();
		booking.setBookingDate(bookingDto.getBookingDate());
		booking.setCabType(bookingDto.getCabType());
		booking.setDaysOfTrip(bookingDto.getDaysOfTrip());
		booking.setDropDate(bookingDto.getDropDate());
		booking.setDropPlace(bookingDto.getDropPlace());
		booking.setDutyType(bookingDto.getDutyType());
		booking.setPickupDateAndTime(bookingDto.getPickupDateAndTime());
		booking.setPickupPlace(bookingDto.getPickupPlace());
		booking.setStatus(bookingDto.getStatus());
		booking.setTentativeRoute(bookingDto.getTentativeRoute());
		booking.setVendorId(booking.getVendorId());
		
		if(optGuest.isPresent()) {
			booking.setGuestId(optGuest.get());
		} else {
			Guest savedGuest = guestRepo.save(bookingDto.getGuest());
			booking.setGuestId(savedGuest);			
		}
		
		Booking savedBooking = bookingRepo.save(booking);
		
		if(savedBooking!=null) {
			return savedBooking;
		} else {
			throw new BookingException("Booking not saved!");
		}
		
	}

	@Override
	public Booking getBooking(Integer bookingId) throws BookingException {
		
		Optional<Booking> optBooking = bookingRepo.findById(bookingId);
		
		if(optBooking.isPresent()) {
			return optBooking.get();
		} else {
			throw new BookingException("Booking not found!");
		}

	}

	@Override
	public String deleteBooking(Integer bookingId) throws BookingException {

		Optional<Booking> optBooking = bookingRepo.findById(bookingId);
		
		if(optBooking.isPresent()) {
			bookingRepo.delete(optBooking.get());
			
			return "Booking deleted succesfully.";
		} else {
			throw new BookingException("Booking not found!");
		}
		
	}

	@Override
	public Booking updateBooking(Booking booking) throws BookingException {
		
		Optional<Booking> optBooking = bookingRepo.findById(booking.getBookingId());
		
		if(optBooking.isPresent()) {
			Booking updatedBooking = bookingRepo.save(booking);
			return updatedBooking;
		} else {
			throw new BookingException("Booking not found!");
		}
		
	}

	@Override
	public List<Booking> getAllBooking() throws BookingException {
		
		List<Booking> bookings = bookingRepo.findAll();
		
		if(!bookings.isEmpty()) {
			return bookings;
		} else {
			throw new BookingException("Bookings are not available!");
		}
		
	}

	@Override
	public List<Booking> getAllBookingByVendor(Integer vendorId) throws BookingException {
		
		List<Booking> bookings = bookingRepo.findByVendorId(vendorId); 
		
		if(!bookings.isEmpty()) {
			return bookings;
		} else {
			throw new BookingException("Bookings are not available!");
		}		
		
	}

//	@Override
//	public List<Booking> getAllBookingByGuest(Integer guestId) throws BookingException {
//		// TODO Auto-generated method stub
//		
//		
//		return null;
//	}

	
}
