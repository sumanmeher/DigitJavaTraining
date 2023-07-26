package com.digit.javaTraining.programs;

import java.util.Scanner;

public class prog5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String s1= sc.nextLine();
		s1=s1.toLowerCase();
		int count1=0;
		int count2=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>=65 && s1.charAt(i)<=90 ) {
				count1++;
			}else if(s1.charAt(i)>=97 && s1.charAt(i)<=122){
				count2++;
				
			}
			
		}
		System.out.println("No. of Capital letters: "+count1);
		System.out.println("No. of Small letter: "+count2);

	}

}
