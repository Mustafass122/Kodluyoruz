package com.payment.bir;

public class AssecoPaymentSystem implements PaymentProvider {

	@Override
	public boolean cancelCharge(int chargeId) {
		return false;
	}

	@Override
	public int charge(double totalPrice) {
		System.out.println("Asseco sytem charged ==" + totalPrice);
		return 0;
	}

	@Override
	public String loadvoice(int chargeId) {
		return null;
	}

}
