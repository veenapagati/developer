package com.xworkz.associations.things;

public class Country {
	public String name;
	public City[] cities;
	public Precident  president;
	
	public Country(String name,Precident  president,City[] cities)
	{
		this.name=name;
		this.president=president;
		this.cities=cities;
	}
	
	public Country(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
	}

	public void showToShumos()
	{
		System.out.println(this.name);
		if(president==null) {
			System.out.println("president is null");
		}
		else 
		{
			System.out.println(this.president);
		}
		
		if(cities !=null && cities.length>0) 
		{
		        for (int i = 0; i < cities.length; i++) 
		             {
			             City element = this.cities[i];
			            System.out.println(element);
			                     if(element== null) 
			                     {
			                       System.out.println("city is null");
			                     }
		             }
	    }
	
	
	}	
}


}
