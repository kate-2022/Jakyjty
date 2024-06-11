package com.jakyjty.random.service;

import java.util.Random;

public class RandomResult {

	private static String randomResult;
	
	private static Random random; 
	
	public static String rollTheDice() {
		int result = random.nextInt(1);
		if (result == 0)
			randomResult.equals("Charity :) ");
		if (result == 1)
			randomResult.equals("Party!!!");
		
		return randomResult;
	}
	
}
