package com.xwokz.simple.boot;

import com.xwokz.simple.things.Saloon;

public class SaloonRunner {
	public static void main(String[] args) {
		Saloon Saloon= new Saloon("hairStyle");
		
		Saloon.setprice(45);
		Saloon.quantity=37;
		
		Saloon.total();
		Saloon.display();

}
}
