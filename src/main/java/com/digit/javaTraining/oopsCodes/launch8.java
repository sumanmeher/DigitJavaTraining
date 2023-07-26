package com.digit.javaTraining.oopsCodes;

//Inheritance

class animal2 {
	void eat() {
		System.out.println("Eating");
	}

	void sleep() {
		System.out.println("Sleeping");
	}

	void breathe() {
		System.out.println("Breathing");
	}
}

class monkey extends animal2 {
	@Override
	void eat() {
		System.out.println("Eating banana");
	}
	void sleep() {
		System.out.println("Sleeping");
	}

	void jump() {
		System.out.println("Monkey is jumping");
	}
}

class dog10 extends animal2 {
	@Override
	void eat() {
		System.out.println("Dog is eating");
	}
}
class common{
	void work(animal2 ref) {
		ref.eat();
		ref.sleep();
		ref.breathe();
	}
}

public class launch8 {

	public static void main(String[] args) {
		common c=new common();
		animal2 a1 = new animal2();
		c.work(a1);
		
		monkey m1 = new monkey();
		c.work(m1);
		m1.jump();
		
		dog10 d1 = new dog10();
		c.work(d1);


	}

}
