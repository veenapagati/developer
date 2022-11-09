package inheritance.things.Runner;

import inheritance.things.BacheloreParty;
import inheritance.things.FriendsHappyness;

public class BachelorePartyRunner {
	public static void main(String[] args) {
		BacheloreParty bacheloreparty=new FriendsHappyness("veena",10000,"banglore");
		FriendsHappyness show=(FriendsHappyness)bacheloreparty;
		show.show();
				
	}

}
