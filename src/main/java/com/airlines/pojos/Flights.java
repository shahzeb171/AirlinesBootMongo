package com.airlines.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Flights {

	@Id
	private String id;
	private String fid;
	private String fname;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Flights [id=" + id + ", fid=" + fid + ", fname=" + fname + "]";
	}

}
