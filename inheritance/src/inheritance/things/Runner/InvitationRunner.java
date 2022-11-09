package inheritance.things.Runner;

import inheritance.things.Invitation;
import inheritance.things.NamingCeremony;

public class  InvitationRunner {
	public static void main(String[] args) {
		
		
		
		Invitation invitation=new NamingCeremony("namingceremony",true,"21.05.2025");
		NamingCeremony show=(NamingCeremony) invitation;
		show.show();
		
	
	}

}
