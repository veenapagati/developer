package inheritance.things.Runner;

import inheritance.things.Dowry;
import inheritance.things.Reddy;

public class DowryRunner {
	public static void main(String[] args) {
		Dowry dowry=new Reddy("vidya",5000000,true);
				Reddy show=(Reddy)dowry;
				show.show();
	}
}
