package com.homework.address;

import java.util.ArrayList;

public class BusinessAddress implements Adress {
	
	private String companyName;
	private int streetNo;
	
	public BusinessAddress(String companyName, int streetNo) {
		super();
		this.companyName = companyName;
		this.streetNo = streetNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getStreetName() {
		return streetNo;
	}

	public void setStreetName(int streetName) {
		this.streetNo = streetName;
	}

	@Override
	public void showAdress(ArrayList<Adress> adresses) {
		for(Adress a : adresses) {
			a.toString();
		}
	}

	@Override
	public String toString() {
		return "Company Adress : [Company name : " + this.companyName + " Street No : " + this.streetNo + "]";
	}
	
	
}
