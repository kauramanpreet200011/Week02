package com.revature.day3.assignment;

import java.util.Random;

public class GenerateRandom {
	public int randomNumber() {
		
		Random rand = new Random();
		int rand_1= rand.nextInt(51);
		return rand_1;
	}
	public static void main(String[] args) {
		GenerateRandom g = new GenerateRandom();
		int r= g.randomNumber();
		System.out.println("random no. between 1-50 = "+ r);
		
	}
	
	
	

}
