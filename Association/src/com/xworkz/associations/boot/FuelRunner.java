package com.xworkz.associations.boot;

import com.xworkz.associations.things.*;

public class FuelRunner {
	
	public static void main(String[] args) {
		Brand brand = new Brand();
		Location location = new Location();
		
		Fuel fuel= new Fuel(true,brand,101,5); 
		fuel.display();
		fuel.brand.Brand("hp",456,location,10);
		fuel.brand.location.Location("chord","hospete","karnataka",583201,"india");
		fuel.brand.display();
		fuel.brand.location.display();
	}

}
