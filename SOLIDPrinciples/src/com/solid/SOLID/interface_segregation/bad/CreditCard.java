package com.solid.SOLID.interface_segregation.bad;

public class CreditCard implements ShoppingCard{

	private double currentCreditCardMoney;

	@Override
	public double loadMoney(double value) {
		this.currentCreditCardMoney += value;
		return this.currentCreditCardMoney;
	}

	@Override
	public double withDrawMoney(double value) {
		this.currentCreditCardMoney -= value;
		return this.currentCreditCardMoney;
	}

	@Override
	public double makeOnlineShopping(double value) {
		this.currentCreditCardMoney -= value;
		return this.currentCreditCardMoney;
	}

	@Override
	public double makeMarketShopping(double value) {
		this.currentCreditCardMoney -= value;
		return this.currentCreditCardMoney;
	}
	
}
