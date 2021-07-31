package com.revature.day3.assignment;

import java.util.Scanner;

public class ReturnArray {
	
	public float[] square(int a,int b,int c, int d) {
		
		float[] arr = new float[4];
		arr[0]=a*a;
		arr[1]=b*b;
		arr[2]=c*c;
		arr[3]=d*d;
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ReturnArray r = new ReturnArray();
		int w=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		float[] f=r.square(w,x,y,z);
		for(int i=0;i<4;i++)
		{
			System.out.println(f[i]);
		}
		sc.close();
	}

}
