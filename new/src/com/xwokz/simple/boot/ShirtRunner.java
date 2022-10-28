package com.xwokz.simple.boot;

import com.xwokz.simple.things.ShirtBrand;

public class ShirtRunner {
	public static void main(String[] args) {
		
		
		ShirtBrand shirtbrand = new ShirtBrand("lecis");
		shirtbrand.quantity=37;
		shirtbrand.name="colored";
		
		shirtbrand.total();
		shirtbrand.display();

}
}
