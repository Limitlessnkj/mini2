package com.cg.bean;


import java.sql.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;



//@Entity
//@Table(name = "booking_details")
public class BookingDetail {

//	@Id
//	@SequenceGenerator(name="h_seq", sequenceName="booking_seq")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="h_seq")
	private int id;
	
//	@Column(name = "customer_name")
	@NotEmpty(message = "Required") // validation
	private String custName;
	
//	@Column(name = "hotel_id")
	private int hotelId;
	
//	@Column(name = "from_date")
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull @Past
	private Date fromDate;
	
//	@Column(name = "to_date")
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull 
	private Date toDate;
	
//	@Column(name = "no_of_rooms")
    @Min(1) @Max(10)// validation
	private int noOfRooms;
	
	// parameterized constructor
	public BookingDetail(int id, String custName, int hotelId, Date toDate,
			Date fromDate, int noOfRooms) {
		super();
		this.id = id;
		this.custName = custName;
		this.hotelId = hotelId;
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.noOfRooms = noOfRooms;
	}
	// default constructor
	public BookingDetail() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	@Override
	public String toString() {
		return "BookingDetail [id=" + id + ", custName=" + custName
				+ ", hotelId=" + hotelId + ", toDate=" + toDate + ", fromDate="
				+ fromDate + ", noOfRooms=" + noOfRooms + "]";
	}
	
	
}
