package inheritance.things.Runner;

import inheritance.things.Catering;
import inheritance.things.NorthIndianCatering;

public class CateringRunner {
	public static void main(String[] args) {
		Catering catering=new NorthIndianCatering("northindian",true,1000);
		NorthIndianCatering show=(NorthIndianCatering)catering;
		show.show();
	}

}

