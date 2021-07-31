package com.revature.day2.assignment;

public class Dog extends Canine{
	
	
	public String makeNoise() {
		return "Dog barks";
	}
	
	public String eat() {
		return "Dog eats a bone";
	}

	public String sleep() {
		return "Dog sleeps";
	}

	@Override
	public String toString() {
		return "Dog [makeNoise()=" + makeNoise() + ", eat()=" + eat() + ", sleep()=" + sleep() + ", roam()=" + roam()
				+ "]";
	}


}
