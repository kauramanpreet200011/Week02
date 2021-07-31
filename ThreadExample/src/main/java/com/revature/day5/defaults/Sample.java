package com.revature.day5.defaults;

public interface Sample {
	
	String s1();
	default String s2()
	{
		return null;
	}
	static void s3()
	{
		System.out.println();
	}

}
