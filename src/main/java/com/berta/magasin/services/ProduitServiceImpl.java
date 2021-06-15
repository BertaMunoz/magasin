package com.berta.magasin.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berta.magasin.models.Produit;

public class ProduitServiceImpl extends GenericServiceImpl<Produit>{
	
	public ProduitServiceImpl(JpaRepository<Produit, Integer> repository) {
		super(repository); 
	}
}
