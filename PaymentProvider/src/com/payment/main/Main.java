package com.payment.main;

import com.payment.bir.AssecoPaymentSystem;
import com.payment.bir.IyzicoPaymentSystem;
import com.payment.bir.PaymentProvider;
import com.payment.iki.ClassifiedPaymentIntegrator;
import com.payment.iki.DopingPaymentIntegrator;
import com.payment.iki.PaymentIntegrator;

public class Main {

	public static void main(String[] args) {
		
		PaymentProvider iyzicoPaymentProvider = new IyzicoPaymentSystem();
		PaymentProvider assecoPaymentProvider = new AssecoPaymentSystem();
		
		PaymentIntegrator classfieldPaymentIntegrator = new ClassifiedPaymentIntegrator(assecoPaymentProvider);
		
		classfieldPaymentIntegrator.makePayment(2000);
		
		PaymentIntegrator dopingPaymentIntegrator = new DopingPaymentIntegrator(iyzicoPaymentProvider);
		
		dopingPaymentIntegrator.makePayment(200);
		
	}
}
