package com.payment.iki;

import com.payment.bir.PaymentProvider;

public class ClassifiedPaymentIntegrator implements PaymentIntegrator{

	private PaymentProvider paymentProvider;
	
	public ClassifiedPaymentIntegrator(PaymentProvider paymentProvider) {
		this.paymentProvider = paymentProvider; 
	}
	
	@Override
	public void makePayment(double totalPrice) {
		this.paymentProvider.charge(totalPrice);
		
	}

}
