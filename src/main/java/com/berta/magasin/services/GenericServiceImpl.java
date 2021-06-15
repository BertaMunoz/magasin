package com.berta.magasin.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public class GenericServiceImpl<T> implements GenericService<T> {

	private JpaRepository<T, Long> repository; 
	
	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T save(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
