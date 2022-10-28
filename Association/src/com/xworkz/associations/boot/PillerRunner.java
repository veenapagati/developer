package com.xworkz.associations.boot;

import com.xworkz.associations.things.Company;
import com.xworkz.associations.things.Piller;

public class PillerRunner {
	public static void main(String[] args) {
		Company company=new Company();
		Piller piller=new Piller("piller",4,"banglr",56L,true,company); 
		piller.display();
		piller.company.showoff("piller","constractorbase");
		
		
	}
	

}
