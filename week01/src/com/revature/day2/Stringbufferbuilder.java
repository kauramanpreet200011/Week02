package com.revature.day2;

public class Stringbufferbuilder{
	
	public static void main(String[] args) {
		
		StringBuffer s1= new StringBuffer("String 1");
		StringBuilder s2 = new StringBuilder("String s2");
		System.out.println(s1.append(s2));
		System.out.println(s1.insert(2, "#"));
		System.out.println(s2.deleteCharAt(3));
		System.out.println(s1.substring(2,5));
	}

}
