package com.berta.magasin.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berta.magasin.models.Client;

public class ClientServiceImpl extends GenericServiceImpl<Client> {
	
	public ClientServiceImpl(JpaRepository<Client, Long> repository) {
		super(); 
	}

}
