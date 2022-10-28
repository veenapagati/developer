package com.xworkz.associations.boot;

import com.xworkz.associations.things.God;
import com.xworkz.associations.things.Location;
import com.xworkz.associations.things.Mountain;
import com.xworkz.associations.things.Temple;
import com.xworkz.associations.things.Weapon;

public class MountainRunner {
	public static void main(String[] args) {
		
		Location location = new Location();
		Temple temple = new Temple();
		God god = new God();
		Weapon weapon = new Weapon();
		
		Mountain mountain = new Mountain();
		
		mountain.showMountain("himalaya", 45,location,temple);
		mountain.location.Location("RJ road","vijayanagar","karnataka",587313,"INDIA");
		mountain.location.display();
		mountain.temple.showTemple("rammandir",god,"gavisiddeshwara",886778,44000);
		mountain.temple.god.showGod("saraswathi","vidya", "female", weapon);
		mountain.temple.god.weapon.showWeapon("book", "brightingFuture", 1100);
		
		
		
		
		
		
		
	}

}
