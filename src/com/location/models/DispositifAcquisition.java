package com.location.models;

public abstract class DispositifAcquisition extends Produit {

	protected Objectif typeObj;
	protected double megapixel;
	protected String res;
	
	/**
	 * Constructeur
	 * @param ref La référence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 * @param typeObj Le type d'objectif (Objet <b>Objectif</b>) associé
	 * @param megapixel Le nombre de megapixel de l'appareil
	 * @param res La résolution de l'appareil
	 */
	protected DispositifAcquisition (String ref, String marque, String intitule, 
			double prixJ, int nbStock, Objectif typeObj, double megapixel, String res) {
		super(ref, marque, intitule, prixJ, nbStock );
		this.typeObj = typeObj;
		this.megapixel = megapixel;
		this.res = res;
	}

	public Objectif getTypeObj() {
		return typeObj;
	}

	public void setTypeObj(Objectif typeObj) {
		this.typeObj = typeObj;
	}

	public double getNbPixel() {
		return megapixel;
	}

	public void setNbPixel(double nbPixel) {
		this.megapixel = nbPixel;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}
	
	public String toString() {
		return this.ref + ", " + this.marque + ", " + this.intitule + ", "+ this.prixJ + ", "+ this.nbStock + ", " + this.typeObj + ", " + this.megapixel + ", "+ this.res;
	}
}
