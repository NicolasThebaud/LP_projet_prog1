package com.location.models;


import java.util.TreeSet;

public class Objectif extends Produit {

	protected TreeSet<String> listeModel;
	protected String typeObj;
	
	/**
	 * Constructeur
	 * @param ref La référence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 */
	public Objectif (String ref, String marque, String intitule, double prixJ, int nbStock, String typeObj) {
		super(ref, marque, intitule, prixJ, nbStock );
		this.typeObj = typeObj;
		listeModel = new TreeSet<String>();
	}
	
	public Objectif (String ref, String marque, String intitule, double prixJ, int nbStock, String typeObj,
			TreeSet<String> listeModels) {
		super(ref, marque, intitule, prixJ, nbStock );
		this.typeObj = typeObj;
		this.listeModel = listeModels;
	}

	public TreeSet<String> getListeModel() {
		return listeModel;
	}

	public void setListeModel(TreeSet<String> listeModel) {
		this.listeModel = listeModel;
	}
	
	public String toString() {
		return this.ref + ", " + this.marque + ", " + this.intitule + ", "+ this.prixJ + ", "+ this.nbStock;
	}
}
