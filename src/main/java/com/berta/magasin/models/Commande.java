package com.berta.magasin.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="commande")
public class Commande {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName = "id")
	private Client client;
	
	@ManyToMany
	@JoinTable(
			name="command_has_produit",
			joinColumns= @JoinColumn(name= "commande_id", referencedColumnName= "id"),
			inverseJoinColumns = @JoinColumn(name= "produit_id", referencedColumnName= "id"))
	private List<Produit> produits;
}
