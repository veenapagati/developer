package com.xwokz.simple.boot;

import com.xwokz.simple.things.Lamp;

public class LampRunner {
           public static void main(String[] args) {
			Lamp Lamp= new Lamp("pataki");
			
			Lamp.setprice(45);
			Lamp.quantity=37;
			
			Lamp.total();
			Lamp.display();

}
}


