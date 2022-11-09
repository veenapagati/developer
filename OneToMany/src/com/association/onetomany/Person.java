package com.association.onetomany;

public class Person {
	public String name;
	public Email[] email;
	public Job job=new Job();
	
	public void person( String name , Email[] email) {
		this.name=name;
		this.email=email;
		
		
		}
	public void show() {
		if(email!=null) {
			for(int i=0;i<email.length;i++) {
				Email mail = email[i];
				if(mail!=null) {
					mail.show();
				}
			}
			if(job!=null) {
				job.job(2, "etyewq", false);
				job.show();
			}
			
		}
		
		
		
		System.out.println(name);
	}

}
