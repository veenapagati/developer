package com.xworkz.specifiers;

public class Human2 {
	
	String name = "veena";
	
	public Human human;
	
      public void useHuman( Human human)
      {
    	  System.out.println(human.gender);
    	  System.out.println(human.gf_name);
    	  System.out.println(human.hair);
    	  System.out.println(human.eyes);
    	  System.out.println(human.getname()); // Spoorthi
    	  human.setname("Josheela");
    	  System.out.println("after updating :"+human.getname());
      }

}
