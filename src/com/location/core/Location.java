package com.location.core;

import java.util.ArrayList;
import java.util.Arrays;
import com.location.controllers.LocationManager;
import com.location.models.Produit;
import java.util.Date;


public class Location {

	private Date dateDebut;
	private Date dateFin;
	private Client client;
	private Double montant = 0d;
	private ArrayList<? extends Produit> listProd;
	private final String ID = LocationManager.gen();
	
	public Location (Date dateDebut, Date dateFin, Client client, Produit[] listProd) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.client = client;
		this.listProd = new ArrayList<Produit>(Arrays.asList(listProd));
		for(Produit prod : listProd) this.montant += prod.getPrixJour();
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
		System.out.println("Location contracté par "+this.client.toString());
		System.out.println("("+getDateDebut()+"-"+getDateFin()+")");
		System.out.println("Produit concernés :");
		for (Produit p : listProd) System.out.println("\t"+"* "+p.toString());
		System.out.println("Montant total de la location :"+getMontant()+"€");
	}
	
}
