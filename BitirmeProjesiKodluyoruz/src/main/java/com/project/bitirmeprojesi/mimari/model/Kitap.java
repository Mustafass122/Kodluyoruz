package com.project.bitirmeprojesi.mimari.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Kitaplar")
public class Kitap {

	@Id
	@Column(name = "kitapNo")
	@GeneratedValue
	private int kitapNo;
	
	@Column(name = "kitapIsmi")
	private String kitapIsmi;
	
	@Column(name = "kitapYazari")
	private String kitapYazari;
	
	@Column(name = "basimYili")
	private Date basimYili;
	
	@Column(name = "kitapNotu")
	private String kitapNotu;	
	
	public Kitap(int kitapNo, String kitapIsmi, String kitapYazari, Date basimYili, String kitapNotu) {
		this.kitapNo = kitapNo;
		this.kitapIsmi = kitapIsmi;
		this.kitapYazari = kitapYazari;
		this.basimYili = basimYili;
		this.kitapNotu = kitapNotu;
	}
	
	public int getKitapNo() {
		return kitapNo;
	}
	public void setKitapNo(int kitapNo) {
		this.kitapNo = kitapNo;
	}
	public String getKitapIsmi() {
		return kitapIsmi;
	}
	public void setKitapIsmi(String kitapIsmi) {
		this.kitapIsmi = kitapIsmi;
	}
	public String getKitapYazari() {
		return kitapYazari;
	}
	public void setKitapYazari(String kitapYazari) {
		this.kitapYazari = kitapYazari;
	}
	public Date getBasimYili() {
		return basimYili;
	}
	public void setBasimYili(Date basimYili) {
		this.basimYili = basimYili;
	}
	public String getKitapNotu() {
		return kitapNotu;
	}
	public void setKitapNotu(String kitapNotu) {
		this.kitapNotu = kitapNotu;
	}
	
	
}
