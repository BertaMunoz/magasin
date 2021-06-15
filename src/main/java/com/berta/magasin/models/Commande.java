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
	
	

	public Commande() {
		super();
		
	}

	public Commande(Long id, Client client, List<Produit> produits) {
		super();
		this.id = id;
		this.client = client;
		this.produits = produits;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", client=" + client + ", produits=" + produits + "]";
	}
	
	
}
