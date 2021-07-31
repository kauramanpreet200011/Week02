package com.revature.day2.assignment;

public abstract class Feline implements Animal{
	
	public String roam()
	{
		return "Feline roaming";
	}

	@Override
	public String toString() {
		return "Feline [roam()=" + roam() + "]";
	}
	

}
