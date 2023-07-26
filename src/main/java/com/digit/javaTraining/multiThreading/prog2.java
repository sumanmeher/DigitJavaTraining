package com.digit.javaTraining.multiThreading;

import java.util.Scanner;

class Banking extends Thread {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter acc no: ");
		int accno = sc.nextInt();
		System.out.println("Emter the pin: ");
		int pin = sc.nextInt();
		System.out.println("Banking Completed");
	}
}

class Printing extends Thread {
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

class Add extends Thread {
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

public class prog2 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Banking b = new Banking();
		Printing p = new Printing();
		Add a = new Add();
		
//		b.run();
//		p.run();
//		a.run();
		
		b.start();
		p.start();
		a.start();
		System.out.println("Main Terminated");

	}

}
