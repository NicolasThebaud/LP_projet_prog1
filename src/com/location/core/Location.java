package com.location.core;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

import com.location.controllers.LocationManager;
import com.location.models.Produit;


public class Location {

	private Date dateDebut;
	private Date dateFin;
	private Client client;
	private Double montant;
	private ArrayList<? extends Produit> listProd;
	private final String ID = LocationManager.gen();
	
	public Location (Date dateDebut, Date dateFin, Client client, Double montant, Produit[] listProd) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.client = client;
		this.montant = montant;
		this.listProd = new ArrayList<Produit>(Arrays.asList(listProd));
	}
	
	public String getUUID() {
		return this.ID;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public Client getClient() {
		return client;
	}

	public Double getMontant() {
		return montant;
	}

	public ArrayList<? extends Produit> getListProd() {
		return listProd;
	}
	
	public void affichage() {
		for (Produit p : listProd) {
			System.out.println(p.getReference() + " : "+ p.getIntitule());
		}
	}
	
}
