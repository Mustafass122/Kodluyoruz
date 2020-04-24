package com.solid.SOLID.interface_segregation.good;

public class CreditCard implements ShoppingCard,OnlineShoppingCard,MarketShoppingCard{

	private double currentMoney = 0;

	@Override
	public double makeMarketShopping(double value) {
		this.currentMoney -= value;
		return this.currentMoney;
	}

	@Override
	public double makeOnlineShopping(double value) {
		this.currentMoney -= value;
		return this.currentMoney;
	}

	@Override
	public double loadMoney(double value) {
		this.currentMoney += value;
		return this.currentMoney;
	}

	@Override
	public double whitDrawMoney(double value) {
		this.currentMoney -= value;
		return this.currentMoney;
	}
}
