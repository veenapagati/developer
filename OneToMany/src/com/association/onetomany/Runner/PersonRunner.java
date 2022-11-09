package com.association.onetomany.Runner;

import com.association.onetomany.Email;
import com.association.onetomany.Person;

public class PersonRunner {
	public static void main(String[] args) {
		
		Email mail=new Email();
		mail.email(154568,"08",893635792L);
		
		Email mail1= new Email();
		mail1.email(123625, "90", 6357892485094L);
		
		Email[] mail2= {mail,mail1};
		Person person=new Person() ;
			person.person("veena",mail2);
		
		
		person.show();
		
       
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
