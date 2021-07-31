package com.revature.day2;

import java.util.StringTokenizer;

public class StringToken {
	
	public static void main(String[] args) {
		
		String s = "AMAN : PREET : KAUR";
		
		StringTokenizer st = new StringTokenizer(s,":");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}
