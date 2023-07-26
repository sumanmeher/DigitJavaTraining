package com.digit.javaTraining.multiThreading;

import java.util.Scanner;

class Banking1 implements Runnable {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter acc no: ");
		int accno = sc.nextInt();
		System.out.println("Emter the pin: ");
		int pin = sc.nextInt();
		System.out.println("Banking Completed");
	}
}

class Printing1 implements Runnable {
	public void run() {
		System.out.println("Printing opertion");
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("HI! Good Morning");
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing Completed");
	}
}

class Add1 implements Runnable {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();

		int res = num1 + num2;
		System.out.println("Result: " + res);
	}
}

public class prog3 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Banking1 b = new Banking1();
		Printing1 p = new Printing1();
		Add1 a = new Add1();

		Thread t1 = new Thread(b);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(a);

		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main Terminated");

	}

}
