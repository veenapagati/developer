package com.xwokz.simple.boot;

import com.xwokz.simple.things.CrackerColor;

public class Flower {
	public static String name="rose";
	public boolean type;
	public double price;
	public FlowerColor color=FlowerColor.PINK;
	public double quantity;
	
	public Flower(String  name) {
		this.type=type;
	}
	public void setprice(double price) {
		this.price=price;
	}
	 public void total() {
		 double total=price*quantity;
		 System.out.println(total);
	 }
	public void display() {
		System.out.println(this.type);
		System.out.println(this.color);
		System.out.println(name);
		System.out.println(this.price);
		System.out.println(this.quantity);

}
}
