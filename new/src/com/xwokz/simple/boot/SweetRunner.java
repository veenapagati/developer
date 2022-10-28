package com.xwokz.simple.boot;

import com.xwokz.simple.things.sweet;

public class SweetRunner {
	
	public static void main(String[] args) {
		sweet Sweet= new sweet("laadu");
		Sweet.setprice(45);
		Sweet.quantity=37;
		
		Sweet.total();
		Sweet.display();

		
		
	}

}


