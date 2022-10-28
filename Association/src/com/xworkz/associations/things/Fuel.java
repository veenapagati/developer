package com.xworkz.associations.things;

public class Fuel {
	public boolean special;
	public Type type=Type.PETROL;
	public Brand brand;
	public int  price;
	public int quantity;
	
		
	public Fuel(boolean special, Brand brand, int price, int quantity) {
		super();
		this.special = special;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void display() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println(special);
		System.out.println(type);
		
		
	}
	

}
