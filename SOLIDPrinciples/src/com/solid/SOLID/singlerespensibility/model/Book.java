package com.solid.SOLID.singlerespensibility.model;

public class Book implements Product{

	private String name;
	private double price;
	
	public Book(String name,double price) {
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
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	
}
