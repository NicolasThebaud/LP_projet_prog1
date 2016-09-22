package com.location.models;

public class Camera extends DispositifAcquisition {

	/**
	 * Constructeur
	 * @param ref La r�f�rence du produit
	 * @param marque La marque du produit
	 * @param intitule Le nom du produit
	 * @param prixJ Le prix/Jour de location du produit
	 * @param nbStock Le nb de produit disponible en stock
	 * @param typeObj Le type d'objectif (Objet <b>Objectif</b>) associ�
	 * @param megapixel Le nombre de megapixel de l'appareil
	 * @param res La r�solution de l'appareil
	 */
	protected Camera(String ref, String marque, String intitule, double prixJ,
			int nbStock, String typeObj, double megapixel, String res) {
		super(ref, marque, intitule, prixJ, nbStock, typeObj, megapixel, res);
	}

}
