package equals.xworkz.boot;

public class Patient implements DoctorRules{

	@Override
	public String doctorName() {
		System.out.println("the doctor name is");
		// TODO Auto-generated method stub
		return "vanitha";
	}

	@Override
	public String location() {
		System.out.println("the location");
		// TODO Auto-generated method stub
		return "hospet";
	}

	@Override
	public int fees() {
		System.out.println("the doctor fees is");
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public String hospitalName() {
		System.out.println("the hospital name is");
		// TODO Auto-generated method stub
		return "manitha";
	}

	@Override
	public int noOfBeds() {
		System.out.println("the noOfBeds are");
		// TODO Auto-generated method stub
		return 88;
	}
	
	

}
