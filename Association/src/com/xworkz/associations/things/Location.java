package com.xworkz.associations.things;

public class Location {
	public String street;
	public String City;
	public String state;
	public int pincode;
	public String country;
	
	
	public void Location(String street, String city, String state, int pincode, String country) {
		
		this.street = street;
		this.City = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}
	public void display() {
		System.out.println(street);
		System.out.println(City);
		System.out.println(state);
		System.out.println(pincode);
		System.out.println(country);
		
	}
	


}
