package com.xworkz.associations.things;

public class City {
	public Name name;
	public String capital;
	public double areainsqmeter;
	
	public City(Name name,String capital,double areainsqmeter) 
	{
		this.name=name;
		this.capital=capital;
		this.areainsqmeter=areainsqmeter;
		
	
		System.out.println(capital);
		System.out.println(areainsqmeter);
		
		

}

	public City(String string, boolean b, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
}
