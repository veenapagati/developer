package com.xworkz.associations.things.has_A;

import com.xworkz.associations.things.City;
import com.xworkz.associations.things.Company;
import com.xworkz.associations.things.Country;

import has_A.Address;
import has_A.Location;
import has_A.State;
import has_A.job;

public class PersonRunner {

	public static void main(String[] args) {

		City city = new City("bengaluru",true,"shubham","IT");
		
		 State state = new State("Karnataka", "Me", "BJP", "21");
		 
		 Country country=new Country("India","Modhi","NEW DELHI",49);
		 
		 Address address = new Address(null);
		 
		 Company company = new Company("Google", "Veena", address);
		 Location location  = new Location("dont know", city, state, country);
		 
		 job job = new job(34000, "Developer", false, null)
	}

}
