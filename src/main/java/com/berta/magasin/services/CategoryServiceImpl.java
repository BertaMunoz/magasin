package com.berta.magasin.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berta.magasin.models.Category;

public class CategoryServiceImpl extends GenericServiceImpl<Category>{

	
	public CategoryServiceImpl(JpaRepository<Category, Integer> repository) {
	super(repository); 
}
}
