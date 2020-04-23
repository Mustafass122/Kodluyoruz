package com.ecommerce.payment.provider.model;

import java.sql.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.ecommerce.money.Money;
import com.ecommerce.payment.provider.Paymentprovider;

public class AsseccoPaymentProvider extends Paymentprovider{

	public AsseccoPaymentProvider(Map<Integer, PreviousPayment> previousPaymentMap) {
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
		long milisecondDiff = now.getTime() - paymentRecordDate.getTime();
		long timeDiffAsHour = TimeUnit.HOURS.convert(milisecondDiff, TimeUnit.MILLISECONDS);
		
		if (timeDiffAsHour < 12) {
			super.previousPaymentMap.remove(chargeId);
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
