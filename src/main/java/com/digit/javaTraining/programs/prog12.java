package com.digit.javaTraining.programs;

import java.util.Scanner;

public class prog12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		char[] ca = s.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			switch (ca[i]) {
			case 'a':
				ca[i] = '$';
				break;
			case 'e':
				ca[i] = '#';
				break;
			case 'i':
				ca[i] = '@';
				break;
			case 'o':
				ca[i] = '&';
				break;
			case 'u':
				ca[i] = '^';
				break;
			default:
				break;
			}
		}
		System.out.println("Original String: "+s);
		System.out.println(ca);

	}

}
