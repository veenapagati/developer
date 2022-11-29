package equals.xworkz.boot;

public class Staff implements TeachersRules{

	@Override
	public String teacherName() {
		System.out.println("teaher name is");
		// TODO Auto-generated method stub
		return "lakshmi";
	}

	@Override
	public String course() {
		System.out.println("she is teaching on");
		// TODO Auto-generated method stub
		return "CSE";
	}

	@Override
	public int noOfExperience() {
		System.out.println("she as experience of");
		// TODO Auto-generated method stub
		return 19;
	}

	@Override
	public String schoolName() {
		System.out.println("school name is ");
		// TODO Auto-generated method stub
		return "ggsp";
	}

	@Override
	public boolean type() {
		// TODO Auto-generated method stub
		return false;
	}

}
