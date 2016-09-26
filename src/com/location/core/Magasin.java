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
		for (Location l : listLoc) {
			System.out.println ("Location n° : "+l.getUUID());
			for (Produit p : l.getListProd()) {
				System.out.println (p.getReference()+" : "+p.getIntitule());
			}
		}
	}
	
	public void affichageLocationByClient(String nom, String prenom) {
		for(Location l : listLoc)
			if(l.getClient().getNom().equalsIgnoreCase(nom) && l.getClient().getPrenom().equalsIgnoreCase(prenom)) {
				System.out.println ("Location n° : "+l.getUUID());
				for (Produit p : l.getListProd()) {
					System.out.println (p.getReference()+" : "+p.getIntitule());
				}
			}
	}
	
	public Produit getProdByRef(String ref) throws Exception {
		for(Produit p : this.listProd)
			if(p.getReference().equals(ref)) return p;
		throw new Exception("Produit indispo");
	}
}
