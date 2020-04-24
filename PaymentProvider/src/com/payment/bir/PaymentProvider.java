package com.payment.bir;

public interface PaymentProvider {

	public boolean cancelCharge(int chargeId);
	public int charge(double totalPrice);
	public String loadvoice(int chargeId);
}
