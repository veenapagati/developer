package equals.xworkz.boot;

public class Girls implements PgRules {

	@Override
	public String pgName() {
		System.out.println("name of the");
		// TODO Auto-generated method stub
		return "siganduru chowdeshwari";
	}

	@Override
	public int rent() {
		System.out.println("and the rent is");
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public int noOfRooms() {
		System.out.println("noofrooms are");
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int closeTime() {
		System.out.println("closing time of pg is");
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public String location() {
		System.out.println("location of the pg is");
		// TODO Auto-generated method stub
		return "rajajinagar";
	}

}
