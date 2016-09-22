package com.location.controllers;

import java.util.ArrayList;
import java.util.Comparator;

import com.location.models.*;

public abstract class ProductSorter {
	
	public static void sort(ArrayList<Produit> p, String flag) {
		p.sort(new Comparator<Produit>() {
			public int compare(Produit p1, Produit p2) {
				int algorithm = 0;
				switch(flag) {
					case "ref": 
						algorithm = p1.getReference().compareTo(p2.getReference()); break;
					case "marque": 
						algorithm = p1.getMarque().compareTo(p2.getMarque()); break;
					case "lib": 
						algorithm = p1.getIntitule().compareTo(p2.getIntitule()); break;
					case "prix": 
						algorithm = (p1.getPrixJour() < p2.getPrixJour()) ? -1 : ( (p1.getPrixJour() > p2.getPrixJour()) ? 1 : 0); break;
				}
				return algorithm;
			}
		});
	}
	
/*
	public static void triParReference(ArrayList<Produit> p) {
		p.sort(new Comparator<Produit>() {
			public int compare(Produit p1, Produit p2) {
				return p1.getReference().compareTo(p2.getReference());
			}
		});
	}
	
	public static void triParMarque(ArrayList<Produit> p) {
		p.sort(new Comparator<Produit>() {
			public int compare(Produit p1, Produit p2) {
				return p1.getMarque().compareTo(p2.getMarque());
			}
		});
	}
	
	public static void triParIntitule(ArrayList<Produit> p) {
		p.sort(new Comparator<Produit>() {
			public int compare(Produit p1, Produit p2) {
				return p1.getIntitule().compareTo(p2.getIntitule());
			}
		});
	}
	
	public static void triParJourLocation(ArrayList<Produit> p) {
		p.sort(new Comparator<Produit>() {
			public int compare(Produit p1, Produit p2) {
				return (p1.getPrixJour() < p2.getPrixJour()) ? -1 : ( (p1.getPrixJour() > p2.getPrixJour()) ? 1 : 0);
			}
		});
	}
*/
}
