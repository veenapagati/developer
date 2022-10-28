package com.xwokz.simple.boot;

import com.xwokz.simple.things.Mango;

public class MangoRunner {
	
		public static void main(String[] args) {
			Mango Mango= new Mango("sweetMango");
			
			Mango.setprice(45);
			Mango.quantity=37;
			
			Mango.total();
			Mango.display();

}
	}
