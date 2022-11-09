package inheritance.things;

public class Invitation {
	public String nameOfTheInvitation;
	public boolean type;
	public String venue;

	public Invitation(String nameOfTheInvitation, boolean type, String venue) {
		super();
		this.nameOfTheInvitation = nameOfTheInvitation;
		this.type = type;
		this.venue = venue;
	}
	public void show() {
		System.out.println(nameOfTheInvitation);
		System.out.println(type);
		System.out.println(venue);
	}

}
