package com.digit.javaTraining.programs;

import java.util.Arrays;

public class prog15 {

	public static void main(String[] args) {
		int arr[]= {12,2,34,22,47,56,43,33,11,9,4};
		Arrays.sort(arr);
		
		System.out.print("Sorted Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Second Largest Number of the Array: "+arr[arr.length-2]);
	}

}
