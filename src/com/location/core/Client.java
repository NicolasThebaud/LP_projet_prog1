package com.location.core;

public class Client {

	private String nom, prenom, telephone;
	
	/**
	 * Constructeur
	 * @param nom Le nom du client
	 * @param prenom Le prenom du client
	 * @param telephone Le numero de telephone du client
	 */
	public Client(String nom, String prenom, String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String toString() {
		return getNom()+" "+getPrenom()+" ("+getTelephone()+")";
	}
}
