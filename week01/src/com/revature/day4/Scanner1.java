package com.revature.day4;
import java.util.Scanner;
public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		double div=0;
		try {
	     div=x/y;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("x/y= "+div);
		sc.close();
	}

}
