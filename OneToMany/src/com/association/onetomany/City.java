package com.association.onetomany;

public class City {
	public String name;
	public String capital;
	public String area;
	public int type;
	
	
	public void city(String name, String capital, String area, int type) {
		this.name=name;
		this.capital=capital;
		this.area=area;
		this.type=type;
	}
	public void show() {
		System.out.println(name);
		System.out.println(capital);
		System.out.println(area);
		System.out.println(type);
	
	}
}
