package com.homework.Insurance;

import java.sql.Date;

public abstract class Insurance {

	public String sigortaismi;
	public double ucret;
	public Date bastarih;	
	public Date bittarih;	
	
	public Insurance(String sigortaismi, double ucret, Date bastarih,Date bittarih) {
		this.sigortaismi = sigortaismi;
		this.ucret = ucret;
		this.bastarih = bastarih;
		this.bittarih = bittarih;
	}
	
	public abstract double calculate();
}
