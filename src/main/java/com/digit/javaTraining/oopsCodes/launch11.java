package com.digit.javaTraining.oopsCodes;

interface calculator1{
	int a=10;//public static final
	void add();
	void sub();
	default void div() {
		//a=300;
		System.out.println("Div method from interface");
	}
	static void mul() {
		System.out.println("Mul method from interface");
	}
}

public class launch11 {
	public static void main(String[] args) {
		calculator1 c=new calculator1() {
			@Override
			public void add() {
				System.out.println("Add method from inner type");
				
			}

			@Override
			public void sub() {
				System.out.println("Sub method from inner type");
			}
			
		};
		c.add();
		c.sub();
		c.div();
		calculator1.mul();
	}

}
