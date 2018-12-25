package com.cg.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.BookingDetail;
import com.cg.bean.Hotel;
import com.cg.dao.BookingDao;
import com.cg.exception.HotelException;

//@Transactional
//@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao bookingDao;
	
	@Override
	public List<Hotel> getHotelList() {
		return bookingDao.getHotelList();
	}

	@Override
	public boolean addBookingDetails(BookingDetail detail) throws HotelException {
		return bookingDao.addBookingDetails(detail);
	}

	@Override
	public Hotel getHotel(int hotelId) {
		return bookingDao.getHotel(hotelId);
	}

}
