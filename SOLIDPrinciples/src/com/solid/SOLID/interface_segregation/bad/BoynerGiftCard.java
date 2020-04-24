package com.solid.SOLID.interface_segregation.bad;

public class BoynerGiftCard implements ShoppingCard{

	private double currentBoynerMoney;

	@Override
	public double loadMoney(double value) {
		this.currentBoynerMoney += value;
		return this.currentBoynerMoney;
	}

	@Override
	public double withDrawMoney(double value) {
		this.currentBoynerMoney -= value;
		return this.currentBoynerMoney;
	}

	@Override
	public double makeOnlineShopping(double value) {
		throw new RuntimeException("Boyner Kart İle Online Alışveriş Yapılamaz");
	}

	@Override
	public double makeMarketShopping(double value) {
		throw new RuntimeException("Boyner Kart ile Market Alışverişi Yapılamaz");
	}
	
}
