package com.digit.javaTraining.programs;

import java.util.Scanner;

public class prog7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String s1= sc.nextLine();
		int count=1;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ' && s1.charAt(i+1)==' ') {
				count++;
			}
			
		}
		System.out.println("No. of words: "+count++);

	}

}
