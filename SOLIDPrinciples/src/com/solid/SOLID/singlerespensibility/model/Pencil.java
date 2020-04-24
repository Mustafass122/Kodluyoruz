package com.solid.SOLID.singlerespensibility.model;

public class Pencil implements Product{

	private String name;
	private double price;
	
	public Pencil(String name,double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
