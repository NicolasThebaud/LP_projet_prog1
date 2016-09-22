package com.location.core;

import java.util.ArrayList;

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

	public boolean registerLocation(ArrayList<Location> listLoc) {
		return this.listLoc.addAll(listLoc);
	}

	public ArrayList<? extends Produit> getListProd() {
		return listProd;
	}

	public boolean registeProduit(Produit produit) {
		return this.listProd.add(produit);
	}

	public boolean registeProduit(ArrayList<Produit> listProd) {
		return this.listProd.addAll(listProd);
	}
	
	public void affichageLocation() {
		for (Location l : listLoc) {
			System.out.println ("Location n° : "+l.getUUID());
			for (Produit p : l.getListProd()) {
				System.out.println (p.getReference()+" : "+p.getIntitule());
			}
		}
	}
}
