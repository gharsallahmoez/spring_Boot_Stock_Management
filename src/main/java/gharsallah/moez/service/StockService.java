package gharsallah.moez.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gharsallah.moez.dao.IGestionMagasin;
import gharsallah.moez.dao.IGestionProduit;
import gharsallah.moez.model.Magasin;
import gharsallah.moez.model.Produit;


@Service
public class StockService implements IGestionStock{
	@Autowired
	IGestionMagasin mag; 
	@Autowired
	IGestionProduit prod;
	public void setMag(IGestionMagasin mag) {
		this.mag = mag;
	}

	public void setProd(IGestionProduit prod) {
		this.prod = prod;
	} 
	
	public Produit getProduitByIdProduit(Integer id) {
		
		return prod.findById(id).get();
	}
	public List<Produit> getAllProduits(){
		return (List<Produit>) prod.findAll();
	}
	public List<Magasin> getAllMagasins(){
		return (List<Magasin>) mag.findAll();
		}
	public List<Produit> getAllProduitByMag(Integer id){
		return prod.getAllProduitByMagId(id);
		
	}
	public void addProduit(Produit p) {
		prod.save(p);
	}
	public Magasin getMagById(Integer id) {
		return mag.findById(id).get();
	}
	

}