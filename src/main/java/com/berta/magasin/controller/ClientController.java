package com.berta.magasin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berta.magasin.models.Client;
import com.berta.magasin.services.ClientServiceImpl;

@RestController
@RequestMapping("client")
@CrossOrigin
public class ClientController {

	@Autowired
	public ClientServiceImpl service;
	
	@GetMapping("")
	public List<Client> findAll() {
	
		return this.service.findAll(); 
	
	}
	
	@GetMapping("{id}")
	public Client findById(@PathVariable int id) {
		return this.service.findById(id);
	}
}
