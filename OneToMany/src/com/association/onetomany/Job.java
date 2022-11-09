package com.association.onetomany;

public class Job {
	public double salary;
	public String role;
	public boolean bond;
	public Company Company;
	
	public void job( double salary,String role,boolean bond) {
		this.salary=salary;
		this.role=role;
		this.bond=bond;
		
		
	}
	public void show() {
		System.out.println(salary);
		System.out.println(role);
		System.out.println(bond);
		System.out.println(Company);
	}

}
