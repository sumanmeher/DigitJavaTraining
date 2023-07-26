package com.digit.javaTraining.oopsCodes;
//class Object{       called By default
//			Object(){
//
//			}
//}

class dog1{ //extends Object     by default
	private String name;
	private String color;
	private int age;
	
	dog1(){
		//super();       by default
		name="Rocky";
		color="White";
		age=3;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
	}
}

public class launch3 {

	public static void main(String[] args) {
		dog1 d1=new dog1();
		d1.getData();

	}

}
