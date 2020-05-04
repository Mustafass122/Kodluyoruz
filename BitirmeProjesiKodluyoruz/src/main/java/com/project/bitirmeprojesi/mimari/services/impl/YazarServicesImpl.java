package com.project.bitirmeprojesi.mimari.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bitirmeprojesi.annotation.MyAnnotation;
import com.project.bitirmeprojesi.mimari.DAO.YazarRepo;
import com.project.bitirmeprojesi.mimari.model.Yazar;
import com.project.bitirmeprojesi.mimari.services.YazarServices;

@Service
public class YazarServicesImpl implements YazarServices{

	@Autowired
	private YazarRepo yazarRepo;

	@MyAnnotation(durum = true)
	@Override
	@Transactional
	public void yazarKaydet(Yazar yazar) {
		yazarRepo.save(yazar);
	}

	@MyAnnotation(durum = true)
	@Override
	@Transactional
	public void yazarSil(Yazar yazar) {
		
		if (yazarRepo.isimKitapGetir(yazar.getYazarIsmi()) != null) {
			yazarRepo.delete(yazar);
		}		
	}

	@MyAnnotation(durum = true)
	@Override
	@Transactional
	public void yazarGuncelle(Yazar kitap) {
		yazarRepo.save(kitap);
	}

	@MyAnnotation(durum = true)
	@Override
	public List<Yazar> tumYazarlariGetir() {
		return yazarRepo.tumYazarlarigetir();
	}
	
}
