package com.revature.day2.assignment;

public class Cat extends Feline{
	
	
	public String makeNoise() {
		return "Cat meow";
	}
	
	public String eat() {
		return "Cat eats a rat";
	}
	
	public String sleep() {
		return "rat sleeps";
	}

	@Override
	public String toString() {
		return "Cat [makeNoise()=" + makeNoise() + ", eat()=" + eat() + ", sleep()=" + sleep() + ", roam()=" + roam()
				+ "]";
	}



}
