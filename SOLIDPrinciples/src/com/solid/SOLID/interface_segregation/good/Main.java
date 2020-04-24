package com.solid.SOLID.interface_segregation.good;

public class Main {
	
	public static void main(String[] args) {
		
		ShoppingCard creditCard = new CreditCard();
		ShoppingCard boynerCard = new BoynerCard();
		ShoppingCard sodexoCard = new SodexoCard();
		
		creditCard.loadMoney(100);
		creditCard.whitDrawMoney(20);
		((CreditCard)creditCard).makeOnlineShopping(50);
		
		boynerCard.whitDrawMoney(50);
	}

}
