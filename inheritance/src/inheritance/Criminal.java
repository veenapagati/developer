package inheritance;

public class Criminal {
	public String name;
	public String offense;
	public String gender;
	public boolean jail;
	
	
public Criminal(String name, String offense, String gender, boolean jail) {
		super();
		this.name = name;
		this.offense = offense;
		this.gender = gender;
		this.jail = jail;
	}


public void show() {
	System.out.println(this.name);
	System.out.println(this.offense);
	System.out.println(this.gender);
	System.out.println(this.jail);
	
		
	}

}
