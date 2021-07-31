package com.revature.day5.lambdas;

public class CalMain {
	
	public static void main(String[] args) {
		
		Calculator c = (x,y,op)->{  };
		System.out.println(c.calc(2,3,"+"));
		System.out.println(c.calc(3,2,"-"));
		System.out.println(c.calc(2,3,"*"));
		System.out.println(c.calc(4,2,"/"));
	}

}
