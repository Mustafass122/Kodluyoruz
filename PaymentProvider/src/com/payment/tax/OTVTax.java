package com.payment.tax;

public class OTVTax implements Tax{

	@Override
	public double calculate(double value) {
		return value*0.2;
	}

	
}
