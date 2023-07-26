package com.digit.javaTraining.stringCodes;

public class stringCode2 {

	public static void main(String[] args) {
		String s1=new String("India");
		String s2=new String("India");
		
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		if(s1==s2) {
			System.out.println("Reference are equal");
		}else {
			System.out.println("Reference are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}

	}

}
