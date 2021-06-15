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


import com.berta.magasin.models.Client;
import com.berta.magasin.models.Commande;
import com.berta.magasin.services.ClientServiceImpl;
import com.berta.magasin.services.CommandeServiceImpl;

@RestController
@RequestMapping("commande")
@CrossOrigin
public class CommandeController {

	@Autowired
	public CommandeServiceImpl service;
	
	@GetMapping("")
	public List<Commande> findAll() {
	
		return this.service.findAll(); 
	
	}
	
	@GetMapping("{id}")
	public Commande findById(@PathVariable int id) {
		return this.service.findById(id);
	}
	
	@PostMapping("")
	public Commande save(@RequestBody Commande commande) {
		return this.service.save(commande);
	}
}
