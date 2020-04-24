package com.solid.SOLID.interface_segregation.bad;

public class SodexoCard implements ShoppingCard{

	private double currentSodexoMoney;
	
	@Override
	public double loadMoney(double value) {
		this.currentSodexoMoney += value;			
		return this.currentSodexoMoney;		
	}
	
	@Override
	public double withDrawMoney(double value) {
		this.currentSodexoMoney -= value;
		return this.currentSodexoMoney;
	}
	
	@Override
	public double makeMarketShopping(double value) {
		this.currentSodexoMoney -= value;
		return this.currentSodexoMoney;	
	}
	
	@Override
	public double makeOnlineShopping(double value) {
		throw new RuntimeException("Sodexo Card ile Online Alışveriş Yapılamaz");
	}
}
