package com.digit.javaTraining.oopsCodes;

class Dog {
	private String name;
	private int age;
	private String colour;
	private String breed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}

public class launch2 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("Tommy");
		d1.setAge(7);
		d1.setColour("Brown");
		d1.setBreed("Golden Retriever");
		
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getColour());
		System.out.println(d1.getBreed());

	}

}
