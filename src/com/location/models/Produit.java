package com.location.models;

import java.io.Serializable;

public abstract class Produit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	protected String ref;
	protected String marque;
	protected String intitule;
	protected double prixJ;
	protected int nbStock;
	
	/**
	 * Constructeur
	 * @param ref La r�f�rence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 */
	protected Produit( String ref, String marque, String intitule, double prixJ, int nbStock) {
		this.ref = ref;
		this.marque = marque;
		this.intitule = intitule;
		this.prixJ = prixJ;
		this.nbStock = nbStock;
	}
	
	public String getReference() {
		return ref;
	}
	
	public void setReference(String reference) {
		this.ref = reference;
	}
	
	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public String getIntitule() {
		return intitule;
	}
	
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public double getPrixJour() {
		return prixJ;
	}
	
	public void setPrixJour(double prixJour) {
		this.prixJ = prixJour;
	}
	
	public int getNbStock() {
		return nbStock;
	}
	
	public void setNbStock(int nbStock) {
		this.nbStock = nbStock;
	}
}
