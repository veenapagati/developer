package com.xworkz.associations.things;

import has_A.Address;

public class Company {
	 public String name;
	 public String type;
	 
	 public Company(String string, String string2, Address address2) {
		// TODO Auto-generated constructor stub
	}

	public void showoff(String name,String type) {
		 this.name=name;
		 this.type=type;
		 System.out.println(name);

		 
		 System.out.println(type);
	 }

}
   