package com.xwokz.simple.things;

public class sweet {

	public static String shopName = "darwadpeda";
	public String name;
	public double price;
	public SweetColor color = SweetColor.BLACK;
	public double quantity;

	public sweet(String name) {
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
