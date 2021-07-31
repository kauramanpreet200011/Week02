package com.collections.day4;

public class EmployeeManager {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(12,"abc",2300.00);
		Employee e2 = new Employee(12,"abc",2300.00);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
