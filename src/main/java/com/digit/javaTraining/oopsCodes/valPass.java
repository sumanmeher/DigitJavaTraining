package com.digit.javaTraining.oopsCodes;

import java.util.Scanner;

public class valPass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a password: ");
		String s=sc.nextLine();
		
		boolean valid;
		
		if(s.length()>6 && s.length()<20) {
			valid=true;
		}
		
	}

}
