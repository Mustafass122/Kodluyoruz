package com.ecommerce.payment.provider.model;

import java.sql.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.ecommerce.money.Money;
import com.ecommerce.payment.provider.Paymentprovider;

public class IyzicoPaymentProvider extends Paymentprovider{

	public IyzicoPaymentProvider(Map<Integer, PreviousPayment> previousPaymentMap) {
		super(previousPaymentMap);
	}

	@Override
	public boolean cancelCharge(int chargeId) {
		PreviousPayment previousPayment = super.previousPaymentMap.get(chargeId);
		
		if (previousPayment == null) {
			return false;
		}
		
		Date now = new Date(1);
		Date paymentRecordDate = previousPayment.getRecordDate();
		long millisecondDiff = now.getTime() - paymentRecordDate.getTime();
		long timeDiffAshour = TimeUnit.HOURS.convert(millisecondDiff, TimeUnit.MILLISECONDS);
		
		if (timeDiffAshour < 24) {
			return true;
		}
		return false;
	}

	@Override
	public int charge(Money totalPrice) {
		int chargeId = (int)Math.random() *1000;
		
		PreviousPayment payment =  new PreviousPayment(totalPrice, new Date(1));
		super.putPreviousPaymentMap(chargeId, payment);
		return chargeId;
	}

	@Override
	public PreviousPayment loadInvoice(int chargeId) {
		return super.previousPaymentMap.get(chargeId);
	}

}
