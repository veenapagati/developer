package com.xwokz.simple.boot;

import com.xwokz.simple.things.Milk;

public class MilkRunner {
	public static void main(String[] args) {
		Milk Milk= new Milk("shubham");
		
		Milk.setprice(45);
		Milk.quantity=37;
		
		Milk.total();
		Milk.display();

}
}
