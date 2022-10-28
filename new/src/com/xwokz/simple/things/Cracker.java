package com.xwokz.simple.things;

public class Cracker {
	
	public static String brand="lakshmi";
	public String name;
	public double price;
	public CrackerColor color=CrackerColor.BLACK;
	public double quantity;
	
	public Cracker(String name) {
		this.name=name;
	}
	public void setprice(double price) {
		this.price=price;
	}
	 public void total() {
		 double total=price*quantity;
		 System.out.println(total);
	 }
	public void display() {
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(brand);
		System.out.println(this.price);
		System.out.println(this.quantity);
		
	}

	

}

	


