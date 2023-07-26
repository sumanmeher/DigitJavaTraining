package com.digit.javaTraining.basicPatterns;

public class patternNumber {

	public static void main(String[] args) {
		
		
		int n=5;
		//1 0 1 0 1
		//1 0 1 0 1
		//1 0 1 0 1
		//1 0 1 0 1
		//1 0 1 0 1
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				if(j%2 ==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.print("  ");
			//1 1 1 1 1
			//0 0 0 0 0
			//1 1 1 1 1
			//0 0 0 0 0
			//1 1 1 1 1
			for(int j=0; j<n; j++) {
				if(i%2 ==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.print("  ");
			//1 0 0 0 0
			//0 1 0 0 0
			//0 0 1 0 0
			//0 0 0 1 0
			//0 0 0 0 1
			for(int j=0; j<n; j++) {
				if(i==j) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				if(i==j) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			
			
			System.out.println();
			
		}
		System.out.println();
		int count=1;
		for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			if(i==0 || (i == 1 && count < 10)) {
			System.out.print("0"+ count++ + " ");
			}
			else {
				System.out.print(count++ +" ");;
			}
			
		}
		System.out.println();
		}

	}

}
