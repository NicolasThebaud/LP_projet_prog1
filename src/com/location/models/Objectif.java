package com.location.models;


import java.util.TreeSet;

public class Objectif extends Produit {

	protected TreeSet<String> listeModel;
	
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
