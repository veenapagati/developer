package has_A;

public class Location {
	public String street;
	public City city;
	public State state;
	public Country country;
	
	
	public Location(String street, City city, State state, Country country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	public void locationShowOff() {
		System.out.println(street);
		if (city!=null)
		{
			this.city.showOffCity();
		}
		if(state!=null)
		{
			this.state.showOffstate();
		}
		if(country!=null)
		{
			this.country.showOffCountry();
		}
}
}
