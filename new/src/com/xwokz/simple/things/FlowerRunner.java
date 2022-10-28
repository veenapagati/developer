package com.xwokz.simple.things;
import com.xwokz.simple.boot.Flower;


public class FlowerRunner {
	 public static void main(String[] args) {
		 Flower Flower= new Flower ("lilly");
			Flower.setprice(45);
			Flower.quantity=37;
			
			Flower.total();
			Flower.display();

		 
	 }

}
