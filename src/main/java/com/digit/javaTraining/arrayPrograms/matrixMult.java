package com.digit.javaTraining.arrayPrograms;

import java.util.Scanner;

public class matrixMult {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows in Matrix 1: ");
		int row1=sc.nextInt();
		System.out.println("Enter the no. of columns in Matrix 1: ");
		int col1=sc.nextInt();
		
		System.out.println("Enter the no. of rows in Matrix 2: ");
		int row2=sc.nextInt();
		System.out.println("Enter the no. of columns in Matrix 2: ");
		int col2=sc.nextInt();
		
		int a[][]= new int[row1][col1];
		int b[][]= new int[row2][col2];
		int mult[][]=new int[row1][col2];
		
		//matrix1
		System.out.println("Enter Matrix1 Data");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		//matrix2
		System.out.println("Enter Matrix2 Data");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		//matMult
		
	}

}
