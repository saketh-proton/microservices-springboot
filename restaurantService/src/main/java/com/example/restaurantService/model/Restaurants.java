package com.example.restaurantService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurants")
public class Restaurants {
	
	@Id
	int rid;
	
	String rname;
	String address;
	int cid;
	
	public Restaurants() {
		
	}
	
	public Restaurants(int rid, String rname, String address, int cid) {
		super();
		this.rid=rid;
		this.rname=rname;
		this.address=address;
		this.cid=cid;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
}
