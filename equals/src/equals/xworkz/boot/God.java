package equals.xworkz.boot;

public class God implements TempleRules{

	@Override
	public String templeName() {
		System.out.println("running temple name");
		// TODO Auto-generated method stub
		return "tirupathi";
	}

	@Override
	public int cost() {
		System.out.println("cost is");
		// TODO Auto-generated method stub
		return 19902;
	}

	@Override
	public boolean type() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String godNmae() {
		System.out.println("manedevru");
		// TODO Auto-generated method stub
		return "govinda";
	}

	@Override
	public int openTime() {
		System.out.println("the temple opentime is");
		// TODO Auto-generated method stub
		return 10;
	}

}
