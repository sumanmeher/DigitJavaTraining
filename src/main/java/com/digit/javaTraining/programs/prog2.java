package com.digit.javaTraining.programs;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String s1= sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>=48 && s1.charAt(i)<=57 ) {
				count++;
			}
			
		}
		System.out.println("No. of numbers: "+count);

	}

}
