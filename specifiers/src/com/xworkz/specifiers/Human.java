package com.xworkz.specifiers;

public class Human
{
	private String name = "Spoorthi";
	String gender ;
	boolean eyes ;
	boolean nose;
	boolean hair;
	boolean legs;
    boolean luck;
    boolean hand;
    String gf_name;
    String surnaame;
    int job;
    
    
    
    public String getname() 
    {
    	return this.name;
    }
    
     void setname(String name) 
    {
    	this.name=name;	
    	
    }

	public Human(String gender, boolean eyes, boolean nose, boolean hair, boolean legs, boolean luck, boolean hand,
			String gf_name, String surnaame, int job) {
		super();
		this.gender = gender;
		this.eyes = eyes;
		this.nose = nose;
		this.hair = hair;
		this.legs = legs;
		this.luck = luck;
		this.hand = hand;
		this.gf_name = gf_name;
		this.surnaame = surnaame;
		this.job = job;
	}
   public void showoff() 
   {
	System.out.println(eyes);
	System.out.println(job);
   }
    
    
    
    
    
	

}
