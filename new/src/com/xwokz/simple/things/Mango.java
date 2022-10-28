package com.xwokz.simple.things;

public class Mango {
	public static String shopName="jawariMango";
	public String name;
	public double price;
	public MangoColor color=MangoColor.ORANGE;
	public double quantity;
	
	public Mango(String name) {
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
		System.out.println(shopName);
		System.out.println(this.price);
		System.out.println(this.quantity);

}
}
