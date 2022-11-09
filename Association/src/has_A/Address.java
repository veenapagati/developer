package has_A;

public class Address {
	public Location location;

	public Address(Location location) {
		super();
		this.location = location;
	}
	public void  showOff()
	{
		if(location!=null)
		{
			this.location.locationShowOff();
		}
	}

}
