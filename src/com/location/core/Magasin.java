package com.location.core;

import java.util.ArrayList;

import com.location.models.Produit;

public class Magasin {
	
	private ArrayList<Location> listLoc;
	private ArrayList<? extends Produit> listProd;
	
	public Magasin (ArrayList<Location> listLoc, ArrayList<? extends Produit> listProd) {
		this.listLoc = listLoc;
		this.listProd = listProd;
	}
	
	public Magasin () {
		listLoc = new ArrayList<Location>();
		listProd = new ArrayList<Produit>();
	}

	public ArrayList<Location> getListLoc() {
		return listLoc;
	}

	public void setListLoc(ArrayList<Location> listLoc) {
		this.listLoc = listLoc;
	}

	public ArrayList<? extends Produit> getListProd() {
		return listProd;
	}

	public void setListProd(ArrayList<Produit> listProd) {
		this.listProd = listProd;
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
