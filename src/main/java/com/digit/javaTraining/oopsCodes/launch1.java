package com.digit.javaTraining.oopsCodes;

//Generic Setter & Getter

class Cricketer{
	private String name;
	private String country;
	private int renumeration;
	private int exp;
	
	//Generic Setter
	void setData(String name, String country, int renumeration, int exp) {
		this.name=name;
		this.country=country;
		this.renumeration=renumeration;
		this.exp=exp;
	}
	void getData() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(renumeration);
		System.out.println(exp);
	}
	
	//Specific Setter
	void setName(String name) {
		this.name=name;
	}
	void setCountry(String country) {
		this.country=country;
	}
	void setRenumeration(int renumeration) {
		this.renumeration=renumeration;
	}
	void setExp(int exp) {
		this.exp=exp;
	}
	
	
	//Specific Getter
	String getName() {
		return name;
	}
	String getCountry() {
		return country;
	}
	int getRenumeration() {
		return renumeration;
	}
	int getExp() {
		return exp;
	}
}

public class launch1 {

	public static void main(String[] args) {
		Cricketer c = new Cricketer();
//		c.name="Sachin";            |
//		c.country="India";          | Not Visible
//		c.renumeration=20000000;    | Not Accessible
//		c.exp=25;                   |
		
		c.setData("Sachin", "India", 20000000, 25);
		c.getData();
		
		System.out.println();
		
		Cricketer c1 = new Cricketer();
		c1.setName("Root");
		c1.setCountry("Eng");
		c1.setRenumeration(40000000);
		c1.setExp(7);
		System.out.println(c1.getName());
		System.out.println(c1.getCountry());
		System.out.println(c1.getRenumeration());
		System.out.println(c1.getExp());

	}

}
