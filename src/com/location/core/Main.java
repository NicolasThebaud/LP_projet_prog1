package com.location.core;

import java.util.Date;

import com.location.models.*;

public class Main {

	public static void main(String args[]) {
		(new Main()).init();
	}

	public void init() {
		Magasin magasin = new Magasin();
		
		Objectif objectif1 = new Objectif("456def", "Canon", "ultra zoom 3000", 7, 12);
		Camera cam = new Camera("abc123", "Canon", "super x80", 50, 8, objectif1, 14, "1024*768");
		Trepier pied = new Trepier("ghi456", "Pied2000", "superpod", 15, 20);
		PanneauLed led = new PanneauLed("xyz089", "Philips", "UltraLED", 90, 3, 65536);
		Micro mic = new Micro("azerty0", "Sony", "DF780", 12, 30);
		
		magasin.registerProduit(new Produit[]{ objectif1, cam, pied, led, mic });
		
		Client client = new Client("Jean", "Michel", "0102030405");
		Location location = new Location(new Date(), new Date(), client, new Produit[]{
				objectif1, cam, pied, led, mic
		});
		
		location.affichage();
	}
}
