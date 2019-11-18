package gharsallah.moez.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gharsallah.moez.model.Produit;


@Repository 
	public interface IGestionProduit extends CrudRepository<Produit, Integer>{
	@Query("select p from Produit p where p.mag.id =:x")
	public List<Produit> getAllProduitByMagId(@Param("x") Integer id); 
		
	}