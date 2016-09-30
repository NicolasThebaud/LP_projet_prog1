package com.location.core;

import java.util.Calendar;
import java.util.Date;
import com.location.models.*;

public class Main {

	public static void main(String args[]) {
		(new Main()).init();
	}

	public void init() {
		//Création du magasin
		Magasin magasin = new Magasin();
		
		//Création de quelques références de produits
		Objectif objectif1 = new Objectif("456def", "Canon", "ultra zoom 3000", 7, 12, "24-36mm");
		Camera cam = new Camera("abc123", "Canon", "super x80", 50, 8, objectif1, 14, "1024*768");
		Trepier pied = new Trepier("ghi456", "Pied2000", "superpod", 15, 20);
		PanneauLed led = new PanneauLed("xyz089", "Philips", "UltraLED", 90, 3, 65536);
		Micro mic = new Micro("azerty0", "Sony", "DF780", 12, 30);
		
		//Enregistre les produits dans le magasin
		magasin.registerProduits(new Produit[]{ objectif1, cam, pied, led, mic });
		
		//Création d'un client
		Client client = new Client("Jean", "Michel", "0102030405");
		Location location;
		try {
			//Initialisation des dates de debut/fin
			//NB : les mois sont définis sur [0;11] on rajoute -1 pour decaler cet interval sur [1;12]
			Calendar calendar = Calendar.getInstance();
			calendar.set(2016, 9-1, 22);
			Date date = new Date(calendar.getTimeInMillis());
			calendar.set(2016, 10-1, 22);
			Date date_ = new Date(calendar.getTimeInMillis());
			
			//Création d'un contrat de location
			location = new Location(
					date, date_, client, new Produit[]{
					magasin.getProdByRef("456def"),
					magasin.getProdByRef("abc123"),
					magasin.getProdByRef("ghi456")
			});
			//Une location est liée a un magasin en particulier
			magasin.registerLocation(location);
			
			//Affichage de toutes les locations du magasin
			magasin.affichageLocation();
			//OU - affichage des location d'un client particulier
			magasin.affichageLocationByClient("jean", "michel");
			
			//Conclusion d'un contrat de location; la location est sauvegardée dans le systeme ET archivée dans un fichier
			magasin.conclureLocation(location);
			
			//Calcul de la recette totale sur une periode donnée
			System.out.println(magasin.calculerRecette("201609", "201611"));
		} catch (Exception e) {
			e.printStackTrace(System.out);
			//Une exception est lancée si au moins un produit n'est pas disponible dans le magasin
			System.out.println("Erreur: La location est impossible, un ou plusieurs produits n'est pas disponible");
		}
	}
}
