package com.ecommerce.tax;

import com.ecommerce.money.Money;

public class KDVTax implements Tax{

	private String name;
	private Money value;
	
	public KDVTax(String name,Money value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(Money value) {
		this.value = value;
	}

	@Override
	public Money getTaxValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "KDVTax [name : " + this.name + " value : " + value + "]";
 	}
	
}
