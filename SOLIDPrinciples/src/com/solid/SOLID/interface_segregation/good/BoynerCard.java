package com.solid.SOLID.interface_segregation.good;

public class BoynerCard implements ShoppingCard{

	private double currentMoney = 0;

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
