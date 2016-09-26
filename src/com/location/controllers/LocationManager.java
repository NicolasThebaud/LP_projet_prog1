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
			archiveLocation(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void archiveLocation(Location l) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
		String date = format.format(l.getDateFin());
		FileOutputStream fout = new FileOutputStream(date+".loc");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(l);
		oos.close();
	}
}
