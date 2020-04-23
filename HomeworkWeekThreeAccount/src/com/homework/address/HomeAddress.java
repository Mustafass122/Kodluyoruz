package com.homework.address;

import java.util.ArrayList;

public class HomeAddress implements Adress {

	private String homeName;
	private int streetNo;
	
	public HomeAddress(String homeName, int streetNo) {
		super();
		this.homeName = homeName;
		this.streetNo = streetNo;
	}

	public String getHomeName() {
		return homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	@Override
	public void showAdress(ArrayList<Adress> adresses) {
		
		for(Adress a : adresses) {
			a.toString();
		}
	}

	@Override
	public String toString() {
		return "Home Adress : [Home name : " + this.homeName + " Street No : " + this.streetNo + "]";
	}
	
	
}
