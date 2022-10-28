package com.xworkz.associations.things;

public class God {
	public String name;
	public String mainPower;
	public String gender;
	public Weapon weapon;
	
	
	public void showGod(String name,String mainPower,String gender, Weapon weapon) {
		this.gender=gender;
		this.mainPower=mainPower;
		this.name=name;
		this.weapon=weapon;
		
		System.out.println(gender);
		System.out.println(name);
		System.out.println(weapon);
		System.out.println(mainPower);
	}
	

}
