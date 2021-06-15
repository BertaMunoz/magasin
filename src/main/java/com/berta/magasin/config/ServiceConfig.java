package com.berta.magasin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.berta.magasin.repositories.ICategoryRepository;
import com.berta.magasin.repositories.IClientRepository;
import com.berta.magasin.repositories.ICommandeRepository;
import com.berta.magasin.repositories.IProduitRepository;
import com.berta.magasin.services.CategoryServiceImpl;
import com.berta.magasin.services.ClientServiceImpl;
import com.berta.magasin.services.CommandeServiceImpl;
import com.berta.magasin.services.ProduitServiceImpl;

@Configuration
public class ServiceConfig {

	@Bean
	public ClientServiceImpl ClientServiceFactory(IClientRepository repository) {
		return new ClientServiceImpl(repository); 
	}
	
	@Bean
	public CommandeServiceImpl CommandeServiceFactory(ICommandeRepository repository) {
		return new CommandeServiceImpl(repository); 
	}
	
	@Bean
	public CategoryServiceImpl CategoryServiceFactory(ICategoryRepository repository) {
		return new CategoryServiceImpl(repository);
	}
	
	@Bean
	public ProduitServiceImpl ProduitServiceFactory(IProduitRepository repository) {
		return new ProduitServiceImpl(repository);
	}
}
