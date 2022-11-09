package inheritance.things;

public class NorthIndianCatering extends Catering{
	public NorthIndianCatering(String name, boolean type, int noOfItems) {
		super(name, type, noOfItems);
		// TODO Auto-generated constructor stub
	}

	
		public void show() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(noOfItems);
		
		
	}

}
