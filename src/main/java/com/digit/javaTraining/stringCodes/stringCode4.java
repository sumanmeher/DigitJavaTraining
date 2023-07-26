package com.digit.javaTraining.stringCodes;

import java.util.Scanner;

public class stringCode4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1=sc.next();
		String s2="";
		for(int i=s1.length()-1; i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("Reversed String: " +s2);
		if(s1.equals(s2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
