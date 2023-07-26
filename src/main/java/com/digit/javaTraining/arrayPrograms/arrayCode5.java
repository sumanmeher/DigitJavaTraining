package com.digit.javaTraining.arrayPrograms;

import java.util.Scanner;

public class arrayCode5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of the School: ");
		int schl = sc.nextInt();
		System.out.println("Enter the count of the class: ");
		int cls = sc.nextInt();
		System.out.println("Enter the count of the Student: ");
		int stu = sc.nextInt();

		String arr[][][] = new String[schl][cls][stu];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside school - " + (i));
			for (int j = 0; j < cls; j++) {
				System.out.println("Inside Class: " + (j));
				for (int k = 0; k < stu; k++) {
					System.out.println("Enter the name of student no: "+(k+1));
					arr[i][j][k] = sc.next();
				}
			}

		}
		for(int i=0;i<schl;i++) {
			System.out.println("Inside school - "+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside class : "+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("The name of Student no: "+(k+1)+" is: "+arr[i][j][k]);
					
				}
				
			}
			
		}

	}

}
