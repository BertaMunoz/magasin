package com.berta.magasin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berta.magasin.models.Produit;
import com.berta.magasin.services.ProduitServiceImpl;

@RestController
@RequestMapping("produit")
@CrossOrigin
public class ProduitController {

	@Autowired
	public ProduitServiceImpl service;
	
	@GetMapping("")
	public List<Produit> findAll() {
	
		return this.service.findAll(); 
	
	}
	
	@GetMapping("{id}")
	public Produit findById(@PathVariable int id) {
		return this.service.findById(id);
	}
	
	@PostMapping("")
	public Produit save(@RequestBody Produit produit) {
		return this.service.save(produit);
	}
}
