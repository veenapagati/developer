package inheritance.things;

public class NamingCeremony extends Invitation{
	public NamingCeremony(String nameOfTheInvitation, boolean type, String venue) {
		super(nameOfTheInvitation, type, venue);
		// TODO Auto-generated constructor stub
	
	
	}
	public void show() {
		System.out.println(nameOfTheInvitation);
		System.out.println(type);
		System.out.println(venue);
	}
	

}
