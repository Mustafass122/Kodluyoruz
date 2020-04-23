package com.ecommerce.payment.integrator;

import com.ecommerce.shoppingChart.ShoppingChart;

public interface PaymentIntegrator {

	public int makePayment(ShoppingChart shoppingChart);
}
