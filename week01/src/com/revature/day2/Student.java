package com.revature.day2;

public class Student {
	int rollNo;
	String name;
	Student()
	{
		
	}
	
	Student(int rno,String name1){
		rollNo=rno;
		name=name1;
	}
	void display()
	{
		System.out.println("Roll No =" +rollNo+ "  Name= " +name);
	}

}
