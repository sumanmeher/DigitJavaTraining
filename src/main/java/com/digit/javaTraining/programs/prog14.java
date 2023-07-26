package com.digit.javaTraining.programs;

import java.util.Scanner;

public class prog14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.next();
		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {

			sum = sum + s1.charAt(i);
		}
		System.out.println(sum);

	}

}
