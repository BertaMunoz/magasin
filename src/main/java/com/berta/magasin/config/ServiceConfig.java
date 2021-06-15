package com.berta.magasin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.berta.magasin.repositories.IClientRepository;
import com.berta.magasin.services.ClientServiceImpl;

@Configuration
public class ServiceConfig {

	@Bean
	public ClientServiceImpl ClientServiceFactory(IClientRepository repository) {
		return new ClientServiceImpl(repository); 
	}
	
}
