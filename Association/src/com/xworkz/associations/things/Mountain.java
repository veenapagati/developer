package com.xworkz.associations.things;

public class Mountain {
	public String name;
	public Location location;
	public int height;
	public Temple temple;
	
	
	public void showMountain(String name,int height,Location location,Temple temple) {
		this.height=height;
		this.location=location;
		
		System.out.println(name);
		System.out.println(location);
		System.out.println(height);
		System.out.println(temple);
		System.out.println(temple);
		
	}

}
