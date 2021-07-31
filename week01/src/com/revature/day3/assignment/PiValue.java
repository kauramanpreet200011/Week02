package com.revature.day3.assignment;

public class PiValue {
	
	public double getPi()
	{
		double d=Math.PI;
		return d;
	}
	
	public static void main(String[] args) {
		
		PiValue p = new PiValue();
		double pi = p.getPi();
		System.out.println("PI Value = "+pi);
		
	}

}
