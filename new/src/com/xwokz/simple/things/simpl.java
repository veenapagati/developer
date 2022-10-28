package com.xwokz.simple.things;

public class simpl {

	
	public String name;
	public String place ;
	public String [] colors;
	
	public simpl(String n,String p,String [] c) {

	this.name=n;
	this.place=p;
	this.colors=c;
	System.out.println(n);
	System.out.println(p);
	for (int i = 0; i < c.length; i++) {
		
		System.out.println(c[i]);
		
	}


	
	
	}
	public void display()
	{
		
		System.out.println(this.name);
		
		
		
	}
	
	
}
