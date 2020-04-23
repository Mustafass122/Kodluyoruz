package com.ecommerce.basketitem.collector;

import com.ecommerce.basket.BasketItem;
import com.ecommerce.basket.Baskettype;
import com.ecommerce.shoppingChart.ShoppingChart;

import java.util.ArrayList;
import java.util.List;

public class BasketItemCollector {

	public static List<BasketItem> collectBasketItem(Baskettype type, ShoppingChart shoppingChart){
		
		List<BasketItem> basketItems = new ArrayList<BasketItem>();
		
		for(BasketItem item : shoppingChart.getBasketItemsList()){
			basketItems.add(item);
		}
		
		return basketItems;
		
	}
}
