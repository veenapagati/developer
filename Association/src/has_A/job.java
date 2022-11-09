package has_A;

public class job {
	public double salary;
	public String role;
	public boolean bond;
	public Company company;
	
	public job(double salary, String role, boolean bond, Company company) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company = company;
	}
	public void jobShowOff() {
		System.out.println(salary);
		System.out.println(role);
		System.out.println(bond);
		if(company!=null)
		{
			this.company.ShowOff();
		}
		
	}
	
}