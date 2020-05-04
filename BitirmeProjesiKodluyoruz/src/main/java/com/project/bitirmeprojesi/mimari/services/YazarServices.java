package com.project.bitirmeprojesi.mimari.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.project.bitirmeprojesi.mimari.model.Yazar;

@Service
public interface YazarServices {

	public void yazarKaydet(Yazar yazar);
	public void yazarSil(Yazar yazar);
	public void yazarGuncelle(Yazar kitap);
	public List<Yazar> tumYazarlariGetir();
	
}
