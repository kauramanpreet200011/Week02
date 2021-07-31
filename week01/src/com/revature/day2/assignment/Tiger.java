package com.revature.day2.assignment;

public class Tiger extends Feline{
	
	public String makeNoise() {
		return " tiger makes noise";
	}
	
	public String eat() {
		return "tiger have flesh";
	}
	
	public String sleep() {
		return "tiger sleeps";
	}

	@Override
	public String toString() {
		return "Tiger [makeNoise()=" + makeNoise() + ", eat()=" + eat() + ", sleep()=" + sleep() + ", roam()=" + roam()
				+ "]";
	}



}
