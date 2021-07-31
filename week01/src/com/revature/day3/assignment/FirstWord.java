package com.revature.day3.assignment;

import java.util.Arrays;

public class FirstWord {
	
	public static String sortString(String s)
	{
		char[] arr=s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	public static void findFirstWord()
	{
		String s1 = new String("aman");
		String s2 = new String("kaur");
		System.out.println("string 1 = " +s1);
		System.out.println("string 2 = " +s2);
		String s11=sortString(s1);
		String s22=sortString(s2);
		System.out.println("Sorted String 1 =" +s11);
		System.out.println("Sorted String 2 =" +s22);
	}
	public static void main(String[] args) {
		findFirstWord();
		
	}

}
