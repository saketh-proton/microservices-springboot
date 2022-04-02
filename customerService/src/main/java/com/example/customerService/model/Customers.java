package com.example.customerService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	
	@Id
	int cid;
	
	String cname;
	String item;
	int quantity;
	
	public Customers() {
		
	}
	
	public Customers(int cid, String cname, String item, int quantity) {
		super();
		this.cid=cid;
		this.cname=cname;
		this.item=item;
		this.quantity=quantity;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
