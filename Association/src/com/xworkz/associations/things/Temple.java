package com.xworkz.associations.things;

public class Temple {
	 public String name;
	 public God god;
	 public String mainPriest;
	 public int noOfVisistors;
	 public int collectionPerDay;
	 
	 
	 public void showTemple(String name,God god,String mainPriest,int noOfVisistors,int collectionPerDay) {
		 this.collectionPerDay=collectionPerDay;
		 this.god=god;
		 this.mainPriest=mainPriest;
		 this.name=name;
		 this.noOfVisistors=noOfVisistors;
		 
		 System.out.println(name);
		
		 System.out.println(mainPriest);
		 System.out.println(noOfVisistors);
		 System.out.println(collectionPerDay);
		 
	 }

}
