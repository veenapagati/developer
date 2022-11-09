package com.association.onetomany;

public class State {
	public String name;
	public String cm_name;
	public String capital;
	public int no_of_population;
	
	public void state(String name,String cm_name,String capital,int no_of_population) {
		this.name=name;
		this.cm_name=cm_name;
		this.capital=capital;
		this.no_of_population=no_of_population;
	}
	public void show() {
		System.out.println(name);
		System.out.println(cm_name);
		System.out.println(capital);
		System.out.println(no_of_population);
	}

}
