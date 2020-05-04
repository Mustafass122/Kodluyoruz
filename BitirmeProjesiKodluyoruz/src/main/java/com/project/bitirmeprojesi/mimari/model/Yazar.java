package com.project.bitirmeprojesi.mimari.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Yazarlar")
public class Yazar {

	@Id
	@Column(name = "yazarNo")
	private int yazarNo;
	
	@Column(name = "yazarIsmi")
	private String yazarIsmi;
	
	
	private Set<Kitap> yazdigiKitaplar;
	
	public Yazar(int yazarNo, String yazarIsmi, Set<Kitap> yazdigiKitaplar) {
		this.yazarNo = yazarNo;
		this.yazarIsmi = yazarIsmi;
		this.yazdigiKitaplar = yazdigiKitaplar;
	}

	public int getYazarNo() {
		return yazarNo;
	}

	public void setYazarNo(int yazarNo) {
		this.yazarNo = yazarNo;
	}

	public String getYazarIsmi() {
		return yazarIsmi;
	}

	public void setYazarIsmi(String yazarIsmi) {
		this.yazarIsmi = yazarIsmi;
	}

	public Set<Kitap> getYazdigiKitaplar() {
		return yazdigiKitaplar;
	}

	public void setYazdigiKitaplar(Set<Kitap> yazdigiKitaplar) {
		this.yazdigiKitaplar = yazdigiKitaplar;
	}
	
	
}
