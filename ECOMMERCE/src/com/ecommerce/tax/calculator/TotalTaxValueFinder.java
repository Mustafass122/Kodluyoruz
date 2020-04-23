package com.ecommerce.tax.calculator;

import java.util.Set;

import com.ecommerce.money.Currency;
import com.ecommerce.money.Money;
import com.ecommerce.tax.Tax;

public class TotalTaxValueFinder {

	public static Money sum(Set<Tax> taxs) {
		
		double totalPrice = 0;
		Currency currency = null;
		
		for(Tax tax : taxs) {
			
			if (currency == null) {
				currency = tax.getTaxValue().getCurrency();
			}
			
			Money taxValue = tax.getTaxValue();
			totalPrice += taxValue.getValue();
		}
		return new Money(totalPrice, currency);
	}
}
