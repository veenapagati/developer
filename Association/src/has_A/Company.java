package has_A;

public class Company {
	
	public String name;
	public String ownerName;
	public String adress;
	
	public Company(String name, String ownerName, String adress) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.adress = adress;
	}
	public void ShowOff() {
		System.out.println(name);
		System.out.println(ownerName);
		System.out.println(adress);
	}
	
		
	

}
