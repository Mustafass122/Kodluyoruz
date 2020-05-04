package com.project.bitirmeprojesi.mimari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.bitirmeprojesi.mimari.model.Kitap;
import com.project.bitirmeprojesi.mimari.services.KitapServices;

@RestController
public class KitapController {

	
	@Autowired
	private KitapServices kitapServices;
	
	
	@RequestMapping(value = "/kitap/kaydet", method = RequestMethod.POST)
	public void kitapKaydet(@RequestBody Kitap kitap) {
		kitapServices.kitapKaydet(kitap);
	}
	
	
	@RequestMapping(value = "/book/sil", method = RequestMethod.DELETE)
	public void kitapSil(@RequestBody Kitap kitap) {
		kitapServices.kitapSil(kitap);
	}
	
	
	@RequestMapping(value = "/book/guncelle", method = RequestMethod.PATCH)
	public void kitapGuncelle(@RequestBody Kitap kitap) {
		kitapServices.kitapGuncelle(kitap);
	}
	
	
	@RequestMapping(value = "/book/search/all", method = RequestMethod.GET)
	public List<Kitap> tumKitaplariGetir(){
		return kitapServices.tumKitaplariGetir();
	}
}
