package com.digit.javaTraining.arrayPrograms;

import java.util.Scanner;

public class arrayCode1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count of the student: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0; i<n;i++) {
			System.out.println("Enter the marks of Student no "+ (i+1));
			arr[i]=sc.nextInt();
			}
		
		for(int i=0; i<n;i++) {
			System.out.println("The marks of Student no "+(i+1)+" is "+ arr[i]);
		}

	}

}
