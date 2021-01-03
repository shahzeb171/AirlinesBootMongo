package com.airlines.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bookings {
@Id
	private int bsno;
	private String departure_ccode;
	private String arrival_ccode;
	private String departure_time;
	private String arrival_time;
	private String username;
	private int price;
	public int getBsno() {
		return bsno;
	}
	public void setBsno(int bsno) {
		this.bsno = bsno;
	}
	public String getDeparture_ccode() {
		return departure_ccode;
	}
	public void setDeparture_ccode(String departure_ccode) {
		this.departure_ccode = departure_ccode;
	}
	public String getArrival_ccode() {
		return arrival_ccode;
	}
	public void setArrival_ccode(String arrival_ccode) {
		this.arrival_ccode = arrival_ccode;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bookings [bsno=" + bsno + ", departure_ccode=" + departure_ccode + ", arrival_ccode=" + arrival_ccode
				+ ", departure_time=" + departure_time + ", arrival_time=" + arrival_time + ", username=" + username
				+ ", price=" + price + "]";
	}

}
