package com.association.onetomany;

public class Email {
	public int id;
	public String password;
	public Long mobileNumber;
	public Company company;
	
	
	public void email(int id, String password, Long mobileNumber) {
		this.id=id;
		this.password=password;
		this.mobileNumber=mobileNumber;
		
		
	}
	public void show() {
		if(company!=null) {
			company.company("xyz", "veena");
			
			company.show();
		}
		System.out.println(id);
		System.out.println(password);
		System.out.println(mobileNumber);
		System.out.println(company);
	}
	

}
