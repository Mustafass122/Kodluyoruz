package com.solid.SOLID.singlerespensibility.model;

import com.solid.SOLID.singlerespensibility.old.ProductDataExporter;
import com.solid.SOLID.singlerespensibility.old.ProductJsonExporter;
import com.solid.SOLID.singlerespensibility.old.ProductXmlExporter;

public class Main {

	public static void main(String[] args) {
		
		Product book = new Book("Java Kitabı ", 100);
		Product pencil = new Pencil("Faber Castel", 10);
		
		ProductDataExporter<Product > productJsonExporter = new ProductJsonExporter<Product>();
		System.out.println(productJsonExporter.export(book));
		System.out.println(productJsonExporter.export(pencil));
		
		ProductDataExporter<Product> productXmlExporter = new ProductXmlExporter<Product>();
		System.out.println(productXmlExporter.export(book));
		System.out.println(productXmlExporter.export(pencil));
		
	}
}
