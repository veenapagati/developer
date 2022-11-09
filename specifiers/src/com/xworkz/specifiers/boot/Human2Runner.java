package com.xworkz.specifiers.boot;

import com.xworkz.specifiers.Human;
import com.xworkz.specifiers.Human2;

public class Human2Runner {

	public static void main(String[] args) {
		
		Human2 human2 = new Human2();
		Human human = new Human(null, false, false, false, false, false, false, null, null, 0);
		
		human2.useHuman(human);
		human.getname();
		
		human.showoff();
	
		
	}

}
