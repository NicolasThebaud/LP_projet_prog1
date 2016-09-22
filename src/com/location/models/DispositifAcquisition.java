package com.location.models;

public abstract class DispositifAcquisition extends Produit {

	protected String typeObj;
	protected double nbPixel;
	protected String res;
	
	protected DispositifAcquisition (String ref, String marque, String intitule, double prixJ, int nbStock, String typeObj, double nbPixel, String res) {
		super(ref, marque, intitule, prixJ, nbStock );
		this.typeObj = typeObj;
		this.nbPixel = nbPixel;
		this.res = res;
	}

	public String getTypeObj() {
		return typeObj;
	}

	public void setTypeObj(String typeObj) {
		this.typeObj = typeObj;
	}

	public double getNbPixel() {
		return nbPixel;
	}

	public void setNbPixel(double nbPixel) {
		this.nbPixel = nbPixel;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}
	
	
}
