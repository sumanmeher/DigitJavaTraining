package com.digit.javaTraining.arrayPrograms;

import java.util.Scanner;

public class arrayCode2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count of the student: ");
		int n=sc.nextInt();
		
		String arr[]=new String[n];
		
		for(int i=0; i<n;i++) {
			System.out.println("Enter the name of Student no "+ (i+1));
			arr[i]=sc.next();
			}
		
		for(int i=0; i<n;i++) {
			System.out.println("The name of Student no "+(i+1)+" is "+ arr[i]);
		}

	}

}
