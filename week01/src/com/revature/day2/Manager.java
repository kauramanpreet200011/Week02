package com.revature.day2;

public class Manager {
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setId(100);
		e1.setName("Amanpreet");
		e1.setSalary(70000.00);
		
		System.out.println("ID = " +e1.getId() + "NAME= "+e1.getName() + "SALARY = " +e1.getSalary());
	}

}
