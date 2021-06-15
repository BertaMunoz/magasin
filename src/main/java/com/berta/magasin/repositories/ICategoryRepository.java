package com.berta.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berta.magasin.models.Category;

public interface ICategoryRepository  extends JpaRepository<Category, Integer>{
 
}
