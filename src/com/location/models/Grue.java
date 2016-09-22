package com.location.models;

public class Grue extends MaterielTournage {

	/**
	 * Constructeur
	 * @param ref La référence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 */
	public Grue(String ref, String marque, String intitule, double prixJ,
			int nbStock) {
		super(ref, marque, intitule, prixJ, nbStock);
	}

	public String toString() {
		return super.toString();
	}
}
