package com.xwokz.simple.boot;

import com.xwokz.simple.things.sambar;

public class SambarRunner {
            public static void main(String[] args) {
            	
            	String[] ing={"masala","tomato","water"};
            	String[] col={"red","yellow","green"};
            	String[] supp= {"sambar supplier","plates supplier","water supplier"};
            	String[] client = {"shivu","deepa","poornima"};
            	
            	
            	sambar Sambar = new sambar("bele","veg",true,10,ing,col,supp,client);
            	Sambar.display();
            	
            }
}
