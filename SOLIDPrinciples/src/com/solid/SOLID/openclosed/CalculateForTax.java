package com.solid.SOLID.openclosed;

import java.util.ArrayList;
import java.util.List;

import com.solid.SOLID.singlerespensibility.model.Product;
import com.solid.SOLID.singlerespensibility.model.Tax;

public class CalculateForTax implements Calculator {

	private List<Tax> taxes; 
	
	public CalculateForTax() {
		this.taxes = new ArrayList<Tax>(); 
	}
	public CalculateForTax(List<Tax> taxes) {
		this.taxes = taxes;
	}
	
	@Override
	public double calculate(List<Product> products) {

		double totalTax = 0;
		for(Product product : products) {
			double value = 0;
			for(Tax tax : this.taxes) {
				value += product.getPrice()*tax.getRatio();
			}
			totalTax += value;
		}
		return totalTax;
	}

}
