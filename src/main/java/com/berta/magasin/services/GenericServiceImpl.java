package com.berta.magasin.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berta.magasin.models.Client;

public class GenericServiceImpl<T> implements GenericService<T> {

	private JpaRepository<T, Integer> repository; 
	
	public GenericServiceImpl(JpaRepository<T, Integer> repository) {
		this.repository = repository;
	}

	@Override
	public List<T> findAll() {
		
		return this.repository.findAll();
	}

	@Override
	public T findById(int id) {
		
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public T save(T entity) {
		
		return this.repository.save(entity);
	}

	@Override
	public T update(T entity) {
		
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		
		 this.repository.deleteById(id);
		
	}

}
