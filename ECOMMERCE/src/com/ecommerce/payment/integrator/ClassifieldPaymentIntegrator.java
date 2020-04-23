package com.ecommerce.payment.integrator;

import java.util.List;

import com.ecommerce.basket.BasketItem;
import com.ecommerce.basket.Baskettype;
import com.ecommerce.basketitem.collector.BasketItemCollector;
import com.ecommerce.basketitem.collector.TotalBasketItemFinder;
import com.ecommerce.money.Money;
import com.ecommerce.payment.provider.Paymentprovider;
import com.ecommerce.shoppingChart.ShoppingChart;

public class ClassifieldPaymentIntegrator implements PaymentIntegrator {

	private Baskettype type;
	private Paymentprovider paymentprovider;
	
	public ClassifieldPaymentIntegrator(Paymentprovider paymentprovider,Baskettype type) {
		this.paymentprovider = paymentprovider;
		this.type = type;
	}

	@Override
	public int makePayment(ShoppingChart shoppingChart) {
		
		List<BasketItem> items = BasketItemCollector.collectBasketItem(type, shoppingChart);
		
		Money total = TotalBasketItemFinder.sum(items);
		
		int chargeId = paymentprovider.charge(total);
		
		return chargeId;
	}
	
}
