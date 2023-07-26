package com.digit.javaTraining.oopsCodes;

class dog2{
	private String name;
	private String color;
	private int age;
	private String breed;
	
	dog2(){
		this("Rocky");
	}
	dog2(String name){
		this("Tommy","black");
		this.name=name;
	}
	dog2(String name,String color){
		this("James","White",5);
		this.name=name;
		this.color=color;
	}
	dog2(String name,String color,int age){
		this("Tom","Brown",6,"GR");
		this.name=name;
		this.color=color;
		this.age=age;
	}
	dog2(String name,String color,int age,String breed){
		this.name=name;
		this.color=color;
		this.age=age;
		this.breed=breed;
	}
	
	void  getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(breed);
	}
	
}

public class launch4 {

	public static void main(String[] args) {
		dog2 d1=new dog2();
		d1.getData();

	}

}
