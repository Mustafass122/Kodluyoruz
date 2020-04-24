package com.solid.SOLID.openclosed;

import java.util.List;

import com.solid.SOLID.singlerespensibility.model.Product;

public interface Calculator {

	double calculate(List<Product> products);
}
