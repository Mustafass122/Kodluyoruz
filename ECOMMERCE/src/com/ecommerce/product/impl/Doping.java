package com.ecommerce.product.impl;

import com.ecommerce.money.Money;
import com.ecommerce.product.Product;
import com.ecommerce.product.impl.type.DopingType;

public class Doping implements Product {

	private String name;
	private Money price;
	private DopingType dopingType;
	
	public Doping(String name,Money price,DopingType dopingType) {
		this.name = name;
		this.price = price;
		this.dopingType = dopingType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DopingType getDopingType() {
		return dopingType;
	}

	public void setDopingType(DopingType dopingType) {
		this.dopingType = dopingType;
	}

	@Override
	public Money getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Doping[name : " + name + " price : " + price + " type : " + dopingType + "]" ; 
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
}
