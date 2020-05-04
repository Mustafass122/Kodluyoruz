package com.project.bitirmeprojesi.mimari.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.project.bitirmeprojesi.mimari.model.Kitap;

@Service
public interface KitapServices {

	public void kitapKaydet(Kitap kitap);
	public void kitapSil(Kitap kitap);
	public void kitapGuncelle(Kitap kitap);
	public List<Kitap> tumKitaplariGetir();
	
}
