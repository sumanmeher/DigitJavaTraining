package com.digit.javaTraining.arrayPrograms;

import java.util.Scanner;

/*
 *   School   Class  Students
 *     0        0       2
 *              1       3
 *              2       4
 *     1        0       2
 *              1       3
 */

public class arrayCode6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of the School: ");
		int schl = sc.nextInt();
		
		int arr[][][]=new int[schl][][];
		
		//To complete the count of the classes
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of the class inside the School: "+(i+1));
			int cls=sc.nextInt();
			arr[i]=new int[cls][];
		}
		

	}

}
