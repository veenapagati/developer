package com.xworkz.specifiers.boot.runner;

import com.xworkz.specifiers.boot.Car;
import com.xworkz.specifiers.boot.CarAccess;

public class CarRunner {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Car speed = new Car ();
			CarAccess cars = new CarAccess();
			
			System.out.println(speed.getName());
			System.out.println(speed.getSeries());
			System.out.println(speed.getCompany());
			System.out.println(speed.getNoOfVersion());
			System.out.println(speed.isReadiator());
			System.out.println(speed.getMilage());
			System.out.println(speed.getAi());
			System.out.println(speed.getEngineName());
			System.out.println(speed.getEngineWeight());
			System.out.println(speed.getSpeed());
			System.out.println(speed.getTireName());
			
			
			 System.out.println(System.lineSeparator());  
				
			cars.benz(speed);
			
			
			
			
			
		}

	}



