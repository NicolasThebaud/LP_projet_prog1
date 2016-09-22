package com.location.models;

public class PanneauLed extends AccessoireLumiere {

	protected int nbLed;
	
	/**
	 * Constructeur
	 * @param ref La référence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 * @param nbLed Le nombre de LED composants le panneau
	 */
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
