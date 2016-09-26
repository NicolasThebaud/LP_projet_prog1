package com.location.core;

import java.util.ArrayList;
import java.util.Arrays;

import com.location.models.Produit;

public class Magasin {
	
	private ArrayList<Location> listLoc;
	private ArrayList<Produit> listProd;
	
	public Magasin () {
		listLoc = new ArrayList<Location>();
		listProd = new ArrayList<Produit>();
	}
	
	public Magasin (ArrayList<Location> listLoc, ArrayList<Produit> listProd) {
		this.listLoc = listLoc;
		this.listProd = listProd;
	}

	public ArrayList<Location> getListLoc() {
		return listLoc;
	}
	
	public boolean registerLocation(Location location) {
		return this.listLoc.add(location);
	}

	public boolean registerLocation(Location[] listLoc) {
		return this.listLoc.addAll(new ArrayList<Location>(Arrays.asList(listLoc)));
	}

	public ArrayList<? extends Produit> getListProd() {
		return listProd;
	}

	public boolean registerProduit(Produit produit) {
		return this.listProd.add(produit);
	}

	public boolean registerProduit(Produit[] listProd) {
		return this.listProd.addAll(new ArrayList<Produit>(Arrays.asList(listProd)));
	}
	
	public void affichageLocation() {
		for(Location l : listLoc) {
			l.affichage();
			System.out.println("");
		}
	}
	
	public void affichageLocationByClient(String nom, String prenom) {
		boolean found = false;
		for(Location l : listLoc) {
			if(l.getClient().getNom().equalsIgnoreCase(nom) && l.getClient().getPrenom().equalsIgnoreCase(prenom)) {
				l.affichage();
				found = true;
			} System.out.println("");
		}
		if(!found) System.out.println("Aucune commande trouvée pour "+prenom+" "+nom);
	}
	
	public Produit getProdByRef(String ref) throws Exception {
		for(Produit p : this.listProd)
			if(p.getReference().equals(ref)) return p;
		throw new Exception("Produit indispo");
	}
}
