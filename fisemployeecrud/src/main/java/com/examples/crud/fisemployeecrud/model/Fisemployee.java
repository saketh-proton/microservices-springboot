package com.examples.crud.fisemployeecrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fisemployee")
public class Fisemployee {
	

	@Id
	int empid;
	
	
	String name;
	

	String department;
	
	String desgination;
	
	
	public Fisemployee() {
		
	}
	
	public Fisemployee(int empid, String name, String department, String desgination) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
		this.desgination = desgination;
	}



	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return desgination;
	}

	public void setDesignation(String designation) {
		this.desgination = desgination;
	}
	


}
