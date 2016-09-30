package com.location.controllers;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import com.location.core.Location;

public class LocationManager {

	public static HashSet<String>  __ID = new HashSet<String>();
	private static Random random = new Random();
	
	private static ArrayList<Location> concludedLoc = new ArrayList<Location>();
	
	public static String gen() {
		boolean loop = true;
		String potential = null;
		do {
			char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 10; i++)
			    sb.append(chars[random.nextInt(chars.length)]);
			potential = sb.toString();
			loop = !__ID.add(potential);
		} while(loop);
		return potential;
	}

	public static void conclude(Location l) {
		LocationManager.concludedLoc.add(l);
		try { 
			SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
			String date = format.format(l.getDateFin());
			updateArchive(date); 
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	private static void updateArchive(String dateRef) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
		FileOutputStream fout = new FileOutputStream(dateRef+".loc");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		ArrayList<Location> monthLocs = new ArrayList<Location>();
		for(Location l : concludedLoc) {
			String date = format.format(l.getDateFin());
			if(date.equals(dateRef)) monthLocs.add(l);
		}
		oos.writeObject(monthLocs);
		oos.close();
	}
	
	public static double getResultFromInterval(String dateDebut, String dateFin) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
		Double total = 0d;
		for(Location l : concludedLoc) {
			String tmpDate = format.format(l.getDateFin());
			if(Integer.parseInt(tmpDate) < Integer.parseInt(dateFin) 
					&& Integer.parseInt(tmpDate) > Integer.parseInt(dateDebut))
				total += l.getMontant();
		}
		return total;
	}
}
