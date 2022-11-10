package com.xworkz.overriding;



	public class Prashanth extends Director {
		
		
		public String famousFilm;

		public Prashanth(String name, int noOfFilms,String famousFilm) {
			super(name, noOfFilms);
			this.famousFilm = famousFilm;
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
		public void show()
		{
			
			super.show();
			System.out.println(this.famousFilm);
			
			
		}
		
		
		
		
		
		
		

	}



