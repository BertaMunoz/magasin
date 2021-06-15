package com.berta.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berta.magasin.models.Client;

public interface IClientRepository extends JpaRepository<Client, Long>{

}
