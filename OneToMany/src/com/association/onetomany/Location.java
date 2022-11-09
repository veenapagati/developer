package com.association.onetomany;

public class Location {
	public int no;
	public String street;
	public City city = new City();
	public State state= new State();
	public Country country = new Country();
	
	public void location(int no, String street) {
		this.no=no;
		this.street=street;
		
		
	}
	public void show() {
		
		if(city!=null&&state!=null&&country!=null)
		{
			city.city("Bangalpre","Rajajinagar","Delhi",345);
			state.state("Abc","xyz","veena",90);
			country.country("abd", "xyz", 12, 12);
			country.Show();
			state.show();
			city.show();
			
		}
		else {
			System.out.println("null function ");
		}
		System.out.println(no);
		System.out.println(street);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
	}

}
