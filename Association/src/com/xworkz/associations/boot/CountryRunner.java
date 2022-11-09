package com.xworkz.associations.boot;

import com.xworkz.associations.things.City;
import com.xworkz.associations.things.Country;
import com.xworkz.associations.things.Gender;
import com.xworkz.associations.things.Name;
import com.xworkz.associations.things.Precident;

public class CountryRunner {
public static void main(String[] args) {
	
		
		Precident president =new Precident();
		
		Name name1=new Name("shubham","arvind","garve");
		City city1=new City(name1,"shirdhon",3657);
		
		Name name2=new Name("akshay","r","joshi");
		City city2=new City(name2,"",5677);
		
	
		
		City[] cities= {city1 ,city2 };
		
		Country country = new Country("japan",Precident,cities);
		
		country.showToShumos();
		country.Precident.setPrecident("obama", 5, Gender.LGBT);
		
	

}
}
