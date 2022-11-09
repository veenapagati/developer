package com.association.onetomany;

public class Address {
	public Location location=new Location();

	public void show() {
		
		
		if(location!=null) {
			location.show();
		}
		else{
			System.out.println("pointing to empty");
			
		}
		
		
		
		
		
		
		
		
		
		System.out.println("show location");
		
	}
	
	
	
	
}
