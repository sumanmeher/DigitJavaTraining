package com.digit.javaTraining.fileIOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable{
	String name;
	String country;
	int age;
	int matches;
	int wickets;
	
	public Cricketer(String name, String country, int age, int matches, int wickets) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
		this.matches = matches;
		this.wickets = wickets;
	}
	void display() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(age);
		System.out.println(matches);
		System.out.println(wickets);
	}
}

public class Launch1 {

	public static void main(String[] args) throws Exception {
		Cricketer c1=new Cricketer("Dhoni","India",34,150,20);
		c1.display();
		FileOutputStream fos = new FileOutputStream("C:\\FileOps\\Cricketer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);

	}

}
