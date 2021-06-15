package com.berta.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berta.magasin.models.Commande;

public interface ICommandeRepository extends JpaRepository<Commande, Integer>{ 
	 
}

