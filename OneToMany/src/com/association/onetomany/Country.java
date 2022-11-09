package com.association.onetomany;

public class Country {
	public String name;
	public String capital;
	public int no_of_population;
	public int States;
	
	public void country(String name,String capital,int no_of_population,int States) {
		this.name=name;
		this.capital=capital;
		this.no_of_population=no_of_population;
		this.States=States;
		
	}
	public void Show() {
		System.out.println(name);
		System.out.println(capital);
		System.out.println(no_of_population);
		System.out.println(States);
		
	}

}
