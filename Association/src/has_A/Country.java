package has_A;

public class Country {
	
	public String name;
	public String primeMinister;
	public String capital;
	public int state;
	
	public Country(String name, String primeMinister, String capital, int state) {
		super();
		this.name = name;
		this.primeMinister = primeMinister;
		this.capital = capital;
		this.state = state;
	}
		
	
	public void showOffCountry() {
		System.out.println(name);
		System.out.println(primeMinister);
		System.out.println(capital);
		System.out.println(state);
	}

}
