package com.berta.magasin.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berta.magasin.models.Commande;
import com.berta.magasin.repositories.ICommandeRepository;

public class CommandeServiceImpl extends GenericServiceImpl<Commande> {

	public CommandeServiceImpl(ICommandeRepository repository) {
		super(repository); 
	}
}

//