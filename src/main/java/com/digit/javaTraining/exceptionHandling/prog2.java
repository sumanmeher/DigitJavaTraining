package com.digit.javaTraining.exceptionHandling;

import java.util.Scanner;

class Operations {
	void function1() throws Exception {
		System.out.println("Inside func-1");
		Scanner sc = new Scanner(System.in);

		System.out.println("Division Operation");
		System.out.println("Enter the numerator: ");
		int num = sc.nextInt();

		System.out.println("Enter the denominator: ");
		int den = sc.nextInt();

		int res = num / den;
		System.out.println("Division result is: " + res);
		System.out.println("Left func-1");
	}

	void function2() throws Exception {
		System.out.println("Inside func-2");
		function1();
		System.out.println("Left func-2");
	}

	void function3() throws Exception {
		try {
			System.out.println("Inside func-3");
			function2();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("Left func-3");

	}
}

public class prog2 {
	public static void main(String[] args) throws Exception {
		System.out.println("Inside Main");
		Operations op=new Operations();
		op.function3();
		System.out.println("Left Main");
		
	}
}
