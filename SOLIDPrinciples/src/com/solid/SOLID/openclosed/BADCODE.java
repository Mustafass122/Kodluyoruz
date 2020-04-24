package com.solid.SOLID.openclosed;

import java.util.List;

import com.solid.SOLID.singlerespensibility.model.Product;
import com.solid.SOLID.singlerespensibility.model.Tax;

public class BADCODE {

	public double calculateForPriceofProduct(List<Product> products) {
		double totalValue = 0;
		for(Product product : products) {
			totalValue += product.getPrice();
		}
		return totalValue;
	}
	
	public double calculateForTaxOfProduct(List<Product> products,List<Tax> taxs) {
		double totalTax = 0;
		
		for(Product product : products) {
			double taxForProduct = 0;
			for(Tax tax : taxs) {
				taxForProduct += product.getPrice()*tax.getRatio();
			}
			totalTax += taxForProduct;
		}
		return totalTax;
	}
}
