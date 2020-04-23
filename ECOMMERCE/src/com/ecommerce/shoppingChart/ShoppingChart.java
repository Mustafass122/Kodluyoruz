package com.ecommerce.shoppingChart;

import java.util.List;

import com.ecommerce.basket.BasketItem;

public class ShoppingChart {

	private List<BasketItem> basketItemsList;
	
	public ShoppingChart(List<BasketItem> basketItemsList) {
		this.basketItemsList = basketItemsList;
	}
	
	public void addBasketItem(BasketItem basketItem) {
		this.basketItemsList.add(basketItem);
	}
	
	public BasketItem removeBasketItem(BasketItem basketItem) {
		
		if (this.basketItemsList.remove(basketItem)) {
			return basketItem;
		}
		return null;
	}

	public List<BasketItem> getBasketItemsList() {
		return basketItemsList;
	}

	public void setBasketItemsList(List<BasketItem> basketItemsList) {
		this.basketItemsList = basketItemsList;
	}

	@Override
	public String toString() {
		return "ShoppingChart [basketItemList : " + basketItemsList + " ]";
	}
	
}
