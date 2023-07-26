package com.digit.javaTraining.programs;

import java.util.Arrays;
import java.util.Scanner;

public class prog11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String s1 = sc.next();
		System.out.println("Enter String 2: ");
		String s2 = sc.next();
		if (s1.length() == s2.length()) {
			char[] ca1 = s1.toCharArray();
			char[] ca2 = s2.toCharArray();
			
			Arrays.sort(ca1);
			Arrays.sort(ca2);
			
			if(Arrays.equals(ca1, ca2)==true) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
			
			
			
				
			
		}

	}

}
