package com.homework.account;

import java.sql.Date;
import java.util.ArrayList;

import com.homework.address.Adress;

public class User {

	private String isim;
	private String soyisim;
	private String email;
	private String sifre;
	private String meslek;
	private int yas;
	private ArrayList<Adress> adreslistesi;
	private Date songiris;
	

	public User(String isim, String soyisim, String email, String sifre, String meslek, int yas) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.email = email;
		this.sifre = sifre;
		this.meslek = meslek;
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getMeslek() {
		return meslek;
	}

	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public ArrayList<Adress> getAdreslistesi() {
		return adreslistesi;
	}

	public void setAdreslistesiadd(Adress adress) {
		adreslistesi.add(adress);
	}
	public void setAdreslistesidel(Adress adress) {
		adreslistesi.remove(adress);
	}

	public Date getSongiris() {
		return songiris;
	}

	public void setSongiris(Date songiris) {
		this.songiris = songiris;
	}
	
	
	
}
