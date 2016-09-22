package com.location.models;


import java.util.TreeSet;

public class Objectif extends Produit {

	protected TreeSet<String> listeModel;
	
	/**
	 * Constructeur
	 * @param ref La référence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 */
	protected Objectif (String ref, String marque, String intitule, double prixJ, int nbStock) {
		super(ref, marque, intitule, prixJ, nbStock );
		listeModel = new TreeSet<String>();
	}

	public TreeSet<String> getListeModel() {
		return listeModel;
	}

	public void setListeModel(TreeSet<String> listeModel) {
		this.listeModel = listeModel;
	}
	
	
}
