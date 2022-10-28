package com.xwokz.simple.boot;

import com.xwokz.simple.things.Cracker;

public class CrackerRunner {

		
		public static void main(String[] args) {
			Cracker Cracker= new Cracker("pataki");
			Cracker.setprice(45);
			Cracker.quantity=37;
			
			Cracker.total();
			Cracker.display();

}
}
