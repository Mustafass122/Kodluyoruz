package com.ecommerce.basket;

import java.util.Set;

import com.ecommerce.product.Product;
import com.ecommerce.tax.Tax;

public class BasketItem {

	private Product product;
	private Set<Tax> taxList;
	private Baskettype baskettype;
	
	public BasketItem(Product product, Set<Tax> taxList, Baskettype baskettype) {
		this.product = product;
		this.taxList = taxList;
		this.baskettype = baskettype;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Set<Tax> getTaxList() {
		return taxList;
	}

	public void setTaxList(Set<Tax> taxList) {
		this.taxList = taxList;
	}

	public Baskettype getBaskettype() {
		return baskettype;
	}

	public void setBaskettype(Baskettype baskettype) {
		this.baskettype = baskettype;
	}

	@Override
	public String toString() {
		return "BasketItem [product : " + this.product + " taxList : "  + this.taxList + " type : " + this.baskettype + " ]";
	}
	
	
}
