package inheritance.things;

public class Sound extends Dj{
	public Sound(String name, boolean type, int amount) {
		super(name, type, amount);
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(amount);
	}

	

}
