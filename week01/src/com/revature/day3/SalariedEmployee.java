package com.revature.day3;

public class SalariedEmployee extends Employee implements Taxes {
	private double salary;
	SalariedEmployee()
	{
		
	}
	public SalariedEmployee(int id, String name, String dept, double salary) {
		super(id, name, dept);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmployee [salary=" + salary + "]";
	}
	@Override
	public String getAllowances() {
		// TODO Auto-generated method stub
		return "travel,food,health";
	}
	@Override
	public String payTaxes() {
		// TODO Auto-generated method stub
		return "paying the taxes";
	}
	
}
		
	

	

