package com.project.bitirmeprojesi.mimari.DAO;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.bitirmeprojesi.mimari.model.Yazar;

@Repository
public interface YazarRepo extends CrudRepository<Yazar, Long> {

	@Query("Select Yazar From Yazar yazar Where yazar.yazar.No = :no ")
	public Yazar idKitapGetir(@Param("no") Long no);
	
	@Query("Select y From Yazar y Where y.yazarIsmi = yazarIsmi")
	public Yazar isimKitapGetir(@Param("yazarIsmi")String yazarIsmi);
	
	@Query("Select * From Yazar k")
	public List<Yazar> tumYazarlarigetir();
}
