package inheritance.things.Runner;

import inheritance.things.Deepa;
import inheritance.things.PreWeddingShoot;

public class PreWeddingShootRunner {
	public static void main(String[] args) {
		PreWeddingShoot preWeddingShoot=new Deepa("kira","pampavana",true);
		Deepa show=(Deepa)preWeddingShoot;
		show.show();
		
	}

}
