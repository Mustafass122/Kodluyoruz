package com.payment.bir;

public class IyzicoPaymentSystem implements PaymentProvider {

	@Override
	public boolean cancelCharge(int chargeId) {
		System.out.println("Iyzico system canceled your " + chargeId + " charge");
		return true;
	}

	@Override
	public int charge(double totalPrice) {
		System.out.println("Iyzico system charged == " + totalPrice);
		return (int)Math.random()*1000;
	}

	@Override
	public String loadvoice(int chargeId) {
		System.out.println("Your invoice ==");
		return null;
	}

}
