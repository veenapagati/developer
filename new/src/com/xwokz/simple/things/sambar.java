package com.xwokz.simple.things;

public class sambar {
	public String type;
	public String name;
	public boolean taste;
	public int price;
	public String[] ingredients;
	public String[] colour;
	public String[] suppliers;
	public String[] clients;
	
	public sambar(String type, String name, boolean taste, int price,String[] ingredients, String[] colour,String[] suppliers, String[] clients) 
   {
		this.type=type;
	    this.name=name;
	    this.taste=taste;
	    this.price=price;
	    this.ingredients=ingredients;
	    this.colour=colour;
	    this.suppliers=suppliers;
	    this.clients=clients;
	    	}
	
	public void display () {
		System.out.println(this.type);
		System.out.println(this.name);
		System.out.println(this.taste);
		System.out.println(this.price);
		
		System.out.println(System.lineSeparator());
		for(int i=0; i< ingredients.length; i++) {
			System.out.println(ingredients[i]);
		}
		System.out.println(System.lineSeparator());

			for(int i=0; i<colour.length; i++) {
				System.out.println(this.colour[i]);
			}
				
				for(int i=0; i<suppliers.length; i++) {
					System.out.println(suppliers[i]);
				}
					
				
					for(int i=0; i<clients.length; i++) {
						System.out.println( clients[i]);
					
			
		}
	}
	

}
