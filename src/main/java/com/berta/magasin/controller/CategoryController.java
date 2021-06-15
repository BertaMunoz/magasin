package com.berta.magasin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berta.magasin.models.Category;
import com.berta.magasin.services.CategoryServiceImpl;

@RestController
@RequestMapping("category")
@CrossOrigin
public class CategoryController {

	@Autowired
	public CategoryServiceImpl service;
	
	@GetMapping("")
	public List<Category> findAll() {
		return this.service.findAll();
		//return this.service.findAll(); 
	
	}
	
	@GetMapping("{id}")
	public Category findById(@PathVariable int id) {
		return this.service.findById(id);
	}
	
	@PostMapping("")
	public Category save(@RequestBody Category category) {
		return this.service.save(category);
	}
}
