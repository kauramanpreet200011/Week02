package com.revature.day4;

public class MultipleExceptionsExample {
	
	public static void main(String[] args) {
		public final divideAndStore() {
			try {
				int x=12;
				int q=x/2;
				System.out.println(q);
				
				int[] arr= new int[3];
				arr[100]=q;
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			catch(RuntimeException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
