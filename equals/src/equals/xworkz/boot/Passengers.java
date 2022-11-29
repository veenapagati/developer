package equals.xworkz.boot;

public class Passengers implements MetroRules{

	@Override
	public String name() {
		System.out.println("the name of the metro");
		// TODO Auto-generated method stub
		return "namma metro";
	}

	@Override
	public String location() {
		System.out.println("the location is");
		// TODO Auto-generated method stub
		return "banglore";
	}

	@Override
	public int noOfLocations() {
		System.out.println("and the noOfLocations are");
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public int price() {
		System.out.println("price for each token");
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public boolean wearMask() {
		// TODO Auto-generated method stub
		return false;
	}

}
