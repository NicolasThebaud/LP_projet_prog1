package com.location.models;

public abstract class MaterielTournage extends Produit {

	protected MaterielTournage (String ref, String marque, String intitule, double prixJ, int nbStock) {
		super(ref, marque, intitule, prixJ, nbStock );
	}
}
