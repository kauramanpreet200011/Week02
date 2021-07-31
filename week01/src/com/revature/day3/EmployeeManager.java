package com.revature.day3;

public class EmployeeManager {
	public static void main(String[] args) {
		SalariedEmployee se=new SalariedEmployee(12,"abc","it",1000.00);
		System.out.println(se);
		System.out.println(se.getAllowances());
		System.out.println(se.payTaxes());
		ContractualEmployee ce=new ContractualEmployee(23,"xyz","cse",400);
		System.out.println(ce);
		System.out.println(ce.getAllowances());
	}

}
