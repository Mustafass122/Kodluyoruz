package com.ecommerce.product.impl;

import java.util.List;
import java.util.Set;

import com.ecommerce.money.Money;
import com.ecommerce.product.ReportProduct;

public class CarExpertiseReport implements ReportProduct{

	private String name;
	private Money price;
	
	private List<String> packages;
	private Set<ReportItem> extraService;
	
		public CarExpertiseReport(String name, Money price, Set<ReportItem> extraService) {
		this.name = name;
		this.price = price;
		this.extraService = extraService;
	}

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return name;
		}

		@Override
		public Money getPrice() {
			// TODO Auto-generated method stub
			return price;
		}

		@Override
		public void addReportItem(ReportItem reportItem) {
			this.extraService.add(reportItem);
		}

		@Override
		public void setPackages(List<String> packages) {
			this.packages = packages;
		}

		public Set<ReportItem> getExtraService() {
			return extraService;
		}

		public void setExtraService(Set<ReportItem> extraService) {
			this.extraService = extraService;
		}

		public List<String> getPackages() {
			return packages;
		}

		@Override
		public String toString() {
			return "CarExpertiseReport : [name :  " + this.name + " price : " + this.price + " packages :  " + this.packages + " extraservices : " + extraService + "]";   
		}
	
	
}
