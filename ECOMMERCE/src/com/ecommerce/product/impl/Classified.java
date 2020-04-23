package com.ecommerce.product.impl;

import java.util.Set;

import com.ecommerce.money.Money;
import com.ecommerce.product.ClassifiedProduct;

public class Classified implements ClassifiedProduct{

	private String name;
	private Money price;
	
	private String title;
	private String description;
	private Set<Doping> dopingList;
	
	public Classified(String name,Money price,Set<Doping> dopingList) {
		this.name = name;
		this.price = price;
		this.dopingList = dopingList;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Money getPrice() {
		return price;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Doping> getDopingList() {
		return dopingList;
	}

	public void setDopingList(Set<Doping> dopingList) {
		this.dopingList = dopingList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	@Override
	public void addDoping(Doping doping) {
		dopingList.add(doping);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Classifed[name : " + name + " price : " + price + " title : " +  title + " descireption : " + description + "]"; 
	}
	
	
}
