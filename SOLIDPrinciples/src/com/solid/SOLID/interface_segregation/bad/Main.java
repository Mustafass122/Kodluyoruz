package com.solid.SOLID.interface_segregation.bad;

public class Main {

	public static void main(String[] args) {
		
		ShoppingCard creditCard = new CreditCard();
		ShoppingCard boynerCard = new BoynerGiftCard();
		ShoppingCard sodexoCard = new SodexoCard();
		
		creditCard.loadMoney(1000);
		boynerCard.loadMoney(500);
		sodexoCard.loadMoney(100);
		
		
		creditCard.withDrawMoney(100);
		creditCard.makeMarketShopping(150);
		creditCard.makeOnlineShopping(200);
		
		boynerCard.withDrawMoney(40);
		//boynerCard.makeMarketShopping(60);
		//boynerCard.makeOnlineShopping(70);
		
		sodexoCard.withDrawMoney(7);
		sodexoCard.makeMarketShopping(18);
		//sodexoCard.makeOnlineShopping(25);
	}
}
