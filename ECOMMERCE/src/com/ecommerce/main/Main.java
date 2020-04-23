package com.ecommerce.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ecommerce.basket.BasketItem;
import com.ecommerce.basket.Baskettype;
import com.ecommerce.basketitem.builder.BasketItemBuilder;
import com.ecommerce.money.Currency;
import com.ecommerce.money.Money;
import com.ecommerce.payment.integrator.ClassifieldPaymentIntegrator;
import com.ecommerce.payment.integrator.ExperticeRaportPaymentIntegrator;
import com.ecommerce.payment.integrator.PaymentIntegrator;
import com.ecommerce.payment.provider.Paymentprovider;
import com.ecommerce.payment.provider.model.AsseccoPaymentProvider;
import com.ecommerce.payment.provider.model.IyzicoPaymentProvider;
import com.ecommerce.payment.provider.model.PreviousPayment;
import com.ecommerce.product.ClassifiedProduct;
import com.ecommerce.product.ReportProduct;
import com.ecommerce.product.impl.CarExpertiseReport;
import com.ecommerce.product.impl.Classified;
import com.ecommerce.product.impl.Doping;
import com.ecommerce.product.impl.ReportItem;
import com.ecommerce.product.impl.type.DopingType;
import com.ecommerce.shoppingChart.ShoppingChart;
import com.ecommerce.tax.calculator.KDVTaxCalculator;
import com.ecommerce.tax.calculator.OTVTaxCalculator;
import com.ecommerce.tax.calculator.TaxCalculator;

public class Main {

	public static void main(String[] args) {
		
		Set<Doping> dopings = new HashSet<Doping>();
		dopings.add(new Doping("Güncelim Dopingi", new Money(100, Currency.TL), DopingType.UptoDate));
		
		Classified classified = new Classified("Araç İlanı", new Money(100000, Currency.TL), dopings);
		classified.setTitle("Sıfır Araç Temiz");
		classified.setDescription("ınvıuvbeıbv vıjebnrıv");
		
		Set<ReportItem> extraServices = new HashSet<ReportItem>();
		extraServices.add(new ReportItem("Vale Hizmeti", new Money(50, Currency.TL)));
		extraServices.add(new ReportItem("Araç Yıkama Hizmeti", new Money(100, Currency.TL)));
		ReportProduct experticeReport = new CarExpertiseReport("Otomobil Expertice Raporu", new Money(200, Currency.TL), extraServices);
		
		List<TaxCalculator> taxCalculatorForClassifield = Arrays.asList(new KDVTaxCalculator(), new OTVTaxCalculator());
		BasketItem clasiifieldBasketItem = BasketItemBuilder.buildBasketItem(classified, taxCalculatorForClassifield, Baskettype.Classifiled);
		
		List<TaxCalculator> taxCalculatorForExperticeReport = Arrays.asList(new OTVTaxCalculator());
		BasketItem experticeReportBasketItem = BasketItemBuilder.buildBasketItem(experticeReport, taxCalculatorForExperticeReport, Baskettype.CarExperticeReport);
		
		ShoppingChart shoppingChart = new ShoppingChart(new ArrayList<BasketItem>());
		shoppingChart.addBasketItem(clasiifieldBasketItem);
		shoppingChart.addBasketItem(experticeReportBasketItem);
		
		System.out.println("Alışveriş Sepetimiz : ");
		printSoppingCart(shoppingChart);
		
		Paymentprovider iyzico = new IyzicoPaymentProvider(new HashMap<Integer, PreviousPayment>());
		Paymentprovider asseco = new AsseccoPaymentProvider(new HashMap<Integer, PreviousPayment>());
		
		PaymentIntegrator classifiedIntegrator = new ClassifieldPaymentIntegrator(asseco, Baskettype.Classifiled);
		PaymentIntegrator experticeIntegrator = new ExperticeRaportPaymentIntegrator(iyzico, Baskettype.CarExperticeReport);
		
		int chargeIdForClassifed = classifiedIntegrator.makePayment(shoppingChart);
		int chargeIdForExperticeRaport = experticeIntegrator.makePayment(shoppingChart);
		
		System.out.println("Ödenmiş Faturalar");
		System.out.println(asseco.loadInvoice(chargeIdForClassifed));
		System.out.println(iyzico.loadInvoice(chargeIdForExperticeRaport));
	}
	
	private static void printSoppingCart(ShoppingChart shoppingChart) {
		for(BasketItem basketItem : shoppingChart.getBasketItemsList()) {
			System.out.println(basketItem);
		}
		System.out.println();
	}
}
