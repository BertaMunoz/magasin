package com.berta.magasin.services;

import java.util.List;

public interface GenericService <T> {

	public  List<T> findAll();
	
	public T findById(int id);
	
	public T save(T entity);
	
	public T update(T entity);
	
	public void delete(int id);
	
}
