package com.solid.SOLID.singlerespensibility.old;

import com.solid.SOLID.singlerespensibility.model.Product;

public class ProductXmlExporter<T extends Product> implements ProductDataExporter<T> {

	@Override
	public String export(T product) {
	StringBuilder builder = new StringBuilder();
	builder.append("<Product>");
	builder.append("<Name>");
	builder.append(product.getName());
	builder.append("</Name>");
	builder.append("<Price>");
	builder.append(product.getPrice());
	builder.append("</Product>");
	
		return builder.toString();
	}

}
