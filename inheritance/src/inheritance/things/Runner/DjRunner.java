package inheritance.things.Runner;

import inheritance.things.Dj;
import inheritance.things.Sound;

public class DjRunner {
	public static void main(String[] args) {
		Dj dj=new Sound("tabala",true,56789);
		Sound show=(Sound)dj;
		show.show();
	}

}
