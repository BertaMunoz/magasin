package com.berta.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berta.magasin.models.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Integer>{

}

