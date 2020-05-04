package com.project.bitirmeprojesi.mimari.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.bitirmeprojesi.mimari.model.Kitap;

@Repository
public interface KitapRepo extends CrudRepository<Kitap, Long> {

	@Query("Select Kitap From Kitap kitap Where kitap.kitapNo = :no ")
	public Kitap idKitapGetir(@Param("no") Long no);
	
	@Query("Select k From Kitap k Where k.kitapIsmi = kitapIsmi")
	public Kitap isimKitapGetir(@Param("kitapIsmi")String kitapIsmi);
	
	@Query("Select * From Kitap k")
	public List<Kitap> tumKitaplarigetir();
}
