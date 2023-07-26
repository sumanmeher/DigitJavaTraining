package com.digit.javaTraining.staticCodes;


//final 
class animal2 {
	
	
	void eat() {
		System.out.println("Eating");
	}

	//final 
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
	@Override
	void sleep() {
		System.out.println("Monkey is Sleeping");
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

public class finalCode1 {

	public static void main(String[] args) {
		final int no_of_monkeys=10;
		common c=new common();
		animal2 a1 = new animal2();
		c.work(a1);
		
		monkey m1 = new monkey();
		c.work(m1);
		m1.jump();
		
		dog10 d1 = new dog10();
		c.work(d1);
		
		//System.out.println(no_of_monkeys=11);


	}

}
