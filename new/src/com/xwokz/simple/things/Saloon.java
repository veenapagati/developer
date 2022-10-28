package com.xwokz.simple.things;

public class Saloon {
	public static String shopName = "kalpana";
	public String name;
	public double price;
	public SaloonColor color = SaloonColor.BLACK;
	public double quantity;

	public Saloon(String name) {
		this.name = name;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public void total() {
		double total = price * quantity;
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
