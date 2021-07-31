package com.revature.day2.assignment;

public class Lion extends Feline {
	
	public String makeNoise() {
		return "lion roars";
	}
	
	public String eat() {
		return "lion eats flesh";
	}
	
	public String sleep() {
		return "lion sleeps";
	}

	@Override
	public String toString() {
		return "Lion [makeNoise()=" + makeNoise() + ", eat()=" + eat() + ", sleep()=" + sleep() + ", roam()=" + roam()
				+ "]";
	}


}
