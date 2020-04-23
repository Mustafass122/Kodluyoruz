package com.homework.Insurance;

import java.sql.Date;

public class ResidenceInsurance extends Insurance {

	public ResidenceInsurance(String sigortaismi, double ucret, Date bastarih, Date bittarih) {
		super(sigortaismi, ucret, bastarih, bittarih);
	}

	@Override
	public double calculate() {
		return this.ucret*4;
	}

}
