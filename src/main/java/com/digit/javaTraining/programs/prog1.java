package com.digit.javaTraining.programs;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String s1= sc.nextLine();
		s1=s1.toLowerCase();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u' ) {
				count++;
			}
			
		}
		System.out.println("No. of vowels: "+count);
	}

}
