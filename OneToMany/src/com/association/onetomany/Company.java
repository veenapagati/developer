package com.association.onetomany;

public class Company {
	public String name;
	public String ownerName;
	public Address address=new Address();
	
	public void company(String name, String ownerName) {
		this.name=name;
		this.ownerName=ownerName;
	
	}
	public void show() {
		
		if(address!=null) {
			address.show();
			
		}
		System.out.println(name);
		System.out.println(ownerName);
		
	}

}
