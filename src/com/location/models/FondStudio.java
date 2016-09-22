package com.location.models;

public class FondStudio extends AccessoireLumiere {
	
	protected int taille;
	protected FondStudio(String ref, String marque, String intitule,
			double prixJ, int nbStock, int taille) {
		super(ref, marque, intitule, prixJ, nbStock);
		// TODO Auto-generated constructor stub
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	
	
	
}
