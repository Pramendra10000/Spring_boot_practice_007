package com.jack.JPA_4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Om_Builder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int Building_no;
	private String Cust_Name;
	private long Rera_no;
	private String address;
	private long Amount;
	
	public Om_Builder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Om_Builder(int id, int building_no, String cust_Name, long rera_no, String address, long amount) {
		super();
		this.id = id;
		Building_no = building_no;
		Cust_Name = cust_Name;
		Rera_no = rera_no;
		this.address = address;
		Amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBuilding_no() {
		return Building_no;
	}

	public void setBuilding_no(int building_no) {
		Building_no = building_no;
	}

	public String getCust_Name() {
		return Cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}

	public long getRera_no() {
		return Rera_no;
	}

	public void setRera_no(long rera_no) {
		Rera_no = rera_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAmount() {
		return Amount;
	}

	public void setAmount(long amount) {
		Amount = amount;
	}

	@Override
	public String toString() {
		return "Om_Builder [id=" + id + ", Building_no=" + Building_no + ", Cust_Name=" + Cust_Name + ", Rera_no="
				+ Rera_no + ", address=" + address + ", Amount=" + Amount + "]";
	}
	
	
	
	
	
}
