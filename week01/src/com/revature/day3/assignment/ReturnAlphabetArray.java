package com.revature.day3.assignment;

public class ReturnAlphabetArray {
	
	public static char[] getAlphabetArray()
	{
		char[] arr = new char[26];
		for(int i=0;i<=25;i++)
		{
			arr[i]=(char)(97+i);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		char[] arr= getAlphabetArray();
		
			System.out.println(arr);

	}

}
