package com.cg.dao;

import java.util.List;


import com.cg.bean.BookingDetail;
import com.cg.bean.Hotel;
import com.cg.exception.HotelException;

//@Transactional
//@Repository
public class BookingDaoImpl implements BookingDao {

	/*@PersistenceContext
	private EntityManager eManager;*/
	
	// get all the hotels from database
	@Override
	public List<Hotel> getHotelList() {
		 List<Hotel> deptList=null;
	
		//String qry = "SELECT hotel FROM Hotel hotel";
	   //TypedQuery<Hotel> query = eManager.createQuery(qry, Hotel.class);
	  //List<Hotel> deptList = query.getResultList();
	Hotel hotel1=new Hotel(1010, "Vivanta By Taj", "5 Star", 8000, 25);
	Hotel hotel2=new Hotel(1100, "The Lalit International", "4.7 Star", 8500, 20);
	Hotel hotel3=new Hotel(0100, "Courtyard By Mariott", " 4.6 Star", 7000, 30);
	Hotel hotel4=new Hotel(0010, "The Oberoi", "7 Star", 11000, 15);

	  deptList.add(1,hotel1);
	  deptList.add(2,hotel2);
	  deptList.add(3,hotel3);
	  deptList.add(4,hotel4);
		return deptList;
	}

	// to add details in table
	@Override
	public boolean addBookingDetails(BookingDetail detail) throws HotelException {

		boolean success = false;
		/*try {
		//	eManager.persist(detail);
			success = true;
		} catch (Exception e) {
			// throwing exception by user
			throw new HotelException("Can not update database");
		}*/
		return success;
	}

	// get single hotel by using it id
	@Override
	public Hotel getHotel(int hotelId) {

		//String qStr = "SELECT hotel FROM Hotel hotel WHERE hotel.id = :id";
	   //TypedQuery<Hotel> query = eManager.createQuery(qStr, Hotel.class);
	  //query.setParameter("id", hotelId);
	 //Hotel hotel = query.getSingleResult();
		
		// must exist
		Hotel hotel=null;
		//Hotel hotel = eManager.find(Hotel.class, hotelId);
		return hotel;
	}

}
