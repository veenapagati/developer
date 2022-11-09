package has_A;

public class Email {
	public String id;
	public String password;
	public double mobile_no;
	public Company company;
	public Email(String id, String password, double mobile_no, com.xworkz.associations.things.Company company) {
		super();
		this.id = id;
		this.password = password;
		this.mobile_no = mobile_no;
		this.company = company;
	}
	public void showOffEmail() {
		
		System.out.println(id);
		System.out.println(password);
		System.out.println(mobile_no);
		System.out.println(company);
	}
	
	
	

}
