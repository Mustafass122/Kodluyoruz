package com.solid.SOLID.singlerespensibility.old;

import com.solid.SOLID.singlerespensibility.model.Product;

public interface ProductDataExporter<T extends Product> {

	String export (T product);
}
