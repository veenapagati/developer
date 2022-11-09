package has_A;

public class Person {
	public String name;
	public Email[] email;
	public job job;
	
	public Person(String name, Email[] email, has_A.job job) {
		super();
		this.name = name;
		this.email = email;
		this.job = job;
	}
	public void showOffPerson() {
		System.out.println(name);
		if(job!=null)
		{
			this.job.jobShowOff();
		}
       if(email!=null)
       {
    	   for (int i = 0; i < email.length; i++) {
			Email array = email[i];
			array.showOffEmail();
		}
       }
	

}
}
