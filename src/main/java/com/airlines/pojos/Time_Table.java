package com.airlines.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Time_Table {
@Id
private String id;
private int sno;
private String fid;
private String departureCcode;
private String arrivalCcode;
private int price;
private String arrival_time;
private String departure_time;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public String getDepartureCcode() {
	return departureCcode;
}
public void setDepartureCcode(String departureCcode) {
	this.departureCcode = departureCcode;
}
public String getArrivalCcode() {
	return arrivalCcode;
}
public void setArrivalCcode(String arrivalCcode) {
	this.arrivalCcode = arrivalCcode;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getArrival_time() {
	return arrival_time;
}
public void setArrival_time(String arrival_time) {
	this.arrival_time = arrival_time;
}
public String getDeparture_time() {
	return departure_time;
}
public void setDeparture_time(String departure_time) {
	this.departure_time = departure_time;
}
@Override
public String toString() {
	return "Time_Table [id=" + id + ", sno=" + sno + ", fid=" + fid + ", departureCcode=" + departureCcode
			+ ", arrivalCcode=" + arrivalCcode + ", price=" + price + ", arrival_time=" + arrival_time
			+ ", departure_time=" + departure_time + "]";
}

}
