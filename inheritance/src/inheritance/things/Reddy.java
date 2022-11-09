package inheritance.things;

public class Reddy extends Dowry{

	public Reddy(String name, int amount, boolean type) {
		super(name, amount, type);
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println(name);
		System.out.println(amount);
		System.out.println(type);
	}

}
