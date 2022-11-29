package equals.xworkz.boot.things;

import equals.xworkz.boot.ClassRules;
import equals.xworkz.boot.Parents;
import equals.xworkz.boot.Students;

public class ClassRulesRunner {

	public static void main(String[] args) {
		
		ClassRules ref = new Students();
		Students ref1 = new Students();
		
		ref1.className();
		ref1.noOfStudents();
		ref1.type();
		ref1.roomNo();
		ref1.cr();
		
		// TODO Auto-generated method stub

	}

}
