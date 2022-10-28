package com.xwokz.simple.boot;

import com.xwokz.simple.things.Cigerate;

public class CigeratteRunner {

	public static void main(String[] args) {
		String[] chemicalCompounds={"arsenicFormaldehyde","hydrogenCyanide","lead"};
    	Cigerate cigerate = new Cigerate("king","lightking",6f,"chocolate",10,chemicalCompounds);
    	System.out.println(cigerate.type);
    	System.out.println(cigerate.name);
    	System.out.println(cigerate.price);
    	System.out.println(cigerate.length);
    	System.out.println(cigerate.flavour);
  
    	
    	Cigerate.display();
    

	}

}
