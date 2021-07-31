package com.collections.api;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<Employee> e = new ArrayList<Employee>(); 
		Employee e1 = new Employee(23,"abc",25000);
		Employee e2 = new Employee(14,"xyz",30000);
		e.add(e1);
		e.add(e2);
		System.out.println(e1);
			
		}
	}

