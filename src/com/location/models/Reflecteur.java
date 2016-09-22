package com.location.models;

public class Reflecteur extends AccessoireLumiere {

	protected double taille;
	
	/**
	 * Constructeur
	 * @param ref La référence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 * @param taille La taille du réflécteur (<i>formatté : xxx*xxx</i>)
	 */
	public Reflecteur(String ref, String marque, String intitule, double prixJ, int nbStock, double taille) {
		super(ref, marque, intitule, prixJ, nbStock);
		this.taille = taille;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}
	
	public String toString() {
		return this.ref + ", " + this.marque + ", " + this.intitule + ", "+ this.prixJ + ", "+ this.nbStock + ", "+this.taille;
	}
}
