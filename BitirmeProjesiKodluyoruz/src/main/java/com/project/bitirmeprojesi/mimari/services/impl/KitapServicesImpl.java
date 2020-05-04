package com.project.bitirmeprojesi.mimari.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.bitirmeprojesi.annotation.MyAnnotation;
import com.project.bitirmeprojesi.mimari.DAO.KitapRepo;
import com.project.bitirmeprojesi.mimari.model.Kitap;
import com.project.bitirmeprojesi.mimari.services.KitapServices;

@Service
public class KitapServicesImpl implements KitapServices {

	@Autowired
	private KitapRepo kitapRepo;

	@Override
	@Transactional
	public void kitapKaydet(Kitap kitap) {
		kitapRepo.save(kitap);
	}

	@MyAnnotation(durum = true)
	@Override
	@Transactional
	public void kitapSil(Kitap kitap) {
		if (kitapRepo.isimKitapGetir(kitap.getKitapIsmi()) != null) {
			kitapRepo.delete(kitap);
		}
	}

	@MyAnnotation(durum = true)
	@Override
	@Transactional
	public void kitapGuncelle(Kitap kitap) {
		kitapRepo.save(kitap);
	}

	@MyAnnotation(durum = true)
	@Override
	public List<Kitap> tumKitaplariGetir() {
		return (List<Kitap>) kitapRepo.findAll();
	}
	
	
}
