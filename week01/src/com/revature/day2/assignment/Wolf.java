package com.revature.day2.assignment;

public class Wolf extends Canine {
	
	public String makeNoise() {
		return "Wolf makes noise.";
	}
	
	public String eat() {
		return "flesh";
	}
	

	public String sleep() {
		return "wolf sleeps";
	}

	
	
	@Override
	public String toString() {
		return "Wolf [makeNoise()=" + makeNoise() + ", eat()=" + eat() + ", sleep()=" + sleep() + ", roam()=" + roam()
				+ "]";
	}



}
