package com.digit.javaTraining.staticCodes;

public class staticCode1 {

	int a, b, c; // non-static variable
	static int m, n, o; // static variables
	
	//static block
	static{
		//a=10; //non-static variables cannot be accessed by static member
		//b=20; //non-static variables cannot be accessed by static member
		//c=30; //non-static variables cannot be accessed by static member
		
		m=100;
		n=200;
		o=300;
	}
	//non-static:it will be automatically executed after object creation
	{
		a=10;
		b=20;
		c=30;
	}
	
	//static method
	static void disp() {
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}
	
	//non-static method
	void disp2(){
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		System.out.println(staticCode1.m);
		System.out.println(staticCode1.n);
		System.out.println(staticCode1.o);
		
		staticCode1.disp();
		
		staticCode1 sc1 =new staticCode1();
		sc1.disp2();
	}
	
}
