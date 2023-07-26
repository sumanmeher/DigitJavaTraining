package com.digit.javaTraining.oopsCodes;

class animal{
	animal(){
		System.out.println("Hii from animal's zero parameterized constructor ");
	}
}

class dog3 extends animal{
	dog3(){
		System.out.println("Hii from child class");
	}
}

public class launch5 {

	public static void main(String[] args) {
		dog3 d3=new dog3();

	}

}
