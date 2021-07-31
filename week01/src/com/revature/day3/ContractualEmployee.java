package com.revature.day3;

public class ContractualEmployee extends Employee{
	private float hours;
	
	ContractualEmployee(){
		
	}
	
	
	public ContractualEmployee(int id, String name, String dept, float hours) {
		super(id, name, dept);
		this.hours = hours;
	}
	
	public float getHours() {
		return hours;
	}


	public void setHours(float hours) {
		this.hours = hours;
	}


	@Override
	public String toString() {
		return "ContractualEmployee [hours=" + hours + "]";
	}

	@Override
	public String getAllowances() {
		// TODO Auto-generated method stub
		return "health";
	}
	

}
