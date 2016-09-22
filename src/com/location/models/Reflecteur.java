package com.location.models;

public class Reflecteur extends AccessoireLumiere {

	protected double taille;
	
	protected Reflecteur(String ref, String marque, String intitule, double prixJ, int nbStock, double taille) {
		super(ref, marque, intitule, prixJ, nbStock);
		this.taille = taille;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}
}
