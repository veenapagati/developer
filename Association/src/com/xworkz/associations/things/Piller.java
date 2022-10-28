package com.xworkz.associations.things;

public class Piller {
	public String name;
	public int id;
	public String location;
	public long height;
	public boolean supported;
	public PillerShape pillerShape=PillerShape.ROUND;
	public Company company;
	
	public Piller(String name,int id,String location,long height,boolean supported,Company company) {
		
		this.id=id;
		this.company=company;
		this.height=height;
		this.location=location;
		this.supported=supported;
		this.name=name;
		this.pillerShape=pillerShape;
	     
		
	}
	public  void display() {
		System.out.println(id);
		System.out.println(pillerShape);
		System.out.println(height);
		System.out.println(location);
		System.out.println(supported);
		System.out.println(name);
	}
	

}
