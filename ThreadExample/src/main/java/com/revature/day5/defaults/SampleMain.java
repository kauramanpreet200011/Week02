package com.revature.day5.defaults;

public class SampleMain implements Sample{
	
	public static void main(String[] args) {
	
	}	
	@Override
	public String s1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String s2() {
		// TODO Auto-generated method stub
		return Sample.super.s2();
	}

}
