package com.homework.Insurance;

import java.sql.Date;

public class HealthInsurance extends Insurance {

	public HealthInsurance(String sigortaismi, double ucret, Date bastarih, Date bittarih) {
		super(sigortaismi, ucret, bastarih, bittarih);
	}

	@Override
	public double calculate() {
		return this.ucret*3;
	}

}
