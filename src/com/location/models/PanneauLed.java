package com.location.models;

public class PanneauLed extends AccessoireLumiere {

	protected int nbLed;
	
	protected PanneauLed(String ref, String marque, String intitule,
			double prixJ, int nbStock, int nbLed) {
		super(ref, marque, intitule, prixJ, nbStock);
		this.nbLed = nbLed;
	}

	public int getNbLed() {
		return nbLed;
	}

	public void setNbLed(int nbLed) {
		this.nbLed = nbLed;
	}

}
