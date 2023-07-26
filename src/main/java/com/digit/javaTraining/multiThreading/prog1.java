package com.digit.javaTraining.multiThreading;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the acc no.: ");
		int accno=sc.nextInt();
		System.out.println("Emter the pin: ");
		int pin=sc.nextInt();
		System.out.println("Banking Completed");
		
		System.out.println("Printing opertion");
		for(int i=0;i<=5;i++) {
			System.out.println("HI! Good Morning");
			Thread.sleep(3000);
		}
		System.out.println("Printing Completed");
		
		
	}

}
