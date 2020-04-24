package com.payment.tax;

public class TaxCalculator {

public static double totalTaxValue(double productPrice, Tax[] taxes) {
		
		double totalValue = 0;
		
		if (taxes == null) {
			return totalValue;
		}
		
		for(Tax tax : taxes) {
			totalValue += tax.calculate(productPrice);
		}
		
		return totalValue;
	}
}
