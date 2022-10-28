package com.xwokz.simple.boot;

import com.xwokz.simple.things.jewellery;

public class jewelleryRunner {
	
	public static void main(String[] args) {
		
		String[] gold = { "ring", "earring", "chain"};
		String[] silver = { "ring", "earring", "chain"};
		String[] diamond = { "ring", "earring", "chain"};
		String[] platinum = { "ring", "earring", "chain"};
		String[] metallic = { "ring", "earring", "chain"};
		String[] oxidized= { "ring", "earring", "chain"};
		
		jewellery jewel = new jewellery("soft",false,1234567,88.7f,'s',gold,silver,diamond,platinum,metallic,oxidized);
		System.out.println(jewel.type);
		System.out.println(jewel.price);
		System.out.println(jewel.quality);
		System.out.println(jewel.size);
		System.out.println(jewel.weight);
		
		jewel.display();
	  
		
	}

}
