package com.solid.SOLID.openclosed;

import java.util.List;

import com.solid.SOLID.singlerespensibility.model.Product;

public class CalculateForPrice implements Calculator{

	@Override
	public double calculate(List<Product> products) {
		int value = 0;
		for(Product product : products) {
			value += product.getPrice();
		}
		return value;
	}

}
