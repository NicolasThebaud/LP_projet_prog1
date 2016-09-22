package com.location.models;

public abstract class Son extends Produit {

	/**
	 * Constructeur
	 * @param ref La référence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 */
	protected Son (String ref, String marque, String intitule, double prixJ, int nbStock){
		super(ref, marque, intitule, prixJ, nbStock );
	}
}
