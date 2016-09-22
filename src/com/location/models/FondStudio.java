package com.location.models;

public class FondStudio extends AccessoireLumiere {
	
	protected int taille;
	
	/**
	 * Constructeur
	 * @param ref La référence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 * @param taille La taille du panneau (<i>formatté : xxx*xxx</i>)
	 */
	public FondStudio(String ref, String marque, String intitule,
			double prixJ, int nbStock, int taille) {
		super(ref, marque, intitule, prixJ, nbStock);
		this.taille = taille;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	
	
	
}
