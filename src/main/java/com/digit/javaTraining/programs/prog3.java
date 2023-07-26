package com.digit.javaTraining.programs;

import java.util.Scanner;

public class prog3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String s1= sc.nextLine();
		s1=s1.toLowerCase();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>=0 && s1.charAt(i)<=31) {
				
			}else if(s1.charAt(i)>=48 && s1.charAt(i)<=57) {
				
			}else if(s1.charAt(i)>=65 && s1.charAt(i)<=90) {
				
			}else if(s1.charAt(i)>=97 && s1.charAt(i)<=122) {
				
			}else {
				count++;
			}
			
		}
		System.out.println("No. of special characters: "+count);

	}

}
