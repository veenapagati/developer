package com.xworkz.associations.things;

public class Precident {
	
		
		public String name;
		public int tenure;
		public Gender gender;
		
		public void setPrecident(String name, int tenure,Gender gender) 
		{
		
			this.name=name;
			this.tenure=tenure;
			this.gender=gender;
			
			System.out.println(name);
			System.out.println(tenure);
			System.out.println(Gender.LGBT);
			
		}

	}



