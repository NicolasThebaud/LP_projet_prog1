package com.location.controllers;

import java.util.HashSet;
import java.util.Random;

public class LocationManager {

	public static HashSet<String> __ID = new HashSet<String>();
	private static Random random = new Random();
	
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
}
