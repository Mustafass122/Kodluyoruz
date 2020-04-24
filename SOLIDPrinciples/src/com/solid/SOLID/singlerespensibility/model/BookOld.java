package com.solid.SOLID.singlerespensibility.model;

public class BookOld {

	private String name;
	private double price;
	
	public BookOld(String name,double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void exportAsJson() {
		StringBuilder builder = new StringBuilder();
		builder.append("{Product : ");
		builder.append(" { ");
		builder.append(" Name : ");
		builder.append(getName());
		builder.append(",");
		builder.append(" Price : ");
		builder.append(getPrice());
		builder.append(" }}");
		
		System.out.println(builder.toString());
	}
	public void exportAsXml() {
		StringBuilder builder = new StringBuilder();
		builder.append("<Product>");
		builder.append("<Name>");
		builder.append(getName());
		builder.append("</Name>");
		builder.append("<Price>");
		builder.append(getPrice());
		builder.append("</Product>");
		
		System.out.println(builder.toString());
	}
}
