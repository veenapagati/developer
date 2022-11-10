package com.xworkz.overriding.boot;

import com.xworkz.overriding.Moon;
import com.xworkz.overriding.Satellite;

public class SatelliteRunner {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			Satellite satellite = new Moon(384400.0,true,1969);
			satellite.see();
			
			
			
			
			
		}

	}



