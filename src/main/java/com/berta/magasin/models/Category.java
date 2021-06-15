package com.berta.magasin.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data	
@Entity
@Table(name="category")
public class Category {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom")
	private String nom;
	
}
