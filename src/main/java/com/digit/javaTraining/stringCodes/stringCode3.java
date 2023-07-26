package com.digit.javaTraining.stringCodes;

public class stringCode3 {

	public static void main(String[] args) {
		String s1="RajaRamMohanRoy";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains("Ram"));
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf('M'));
		System.out.println(s1.startsWith("Raja"));
		System.out.println(s1.endsWith("Roy"));
		String s2="";
		String s3="  ";
		System.out.println(s2.isEmpty());
		System.out.println(s3.isBlank());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4, 7));
		char[]ca =s1.toCharArray();
		for(int i=0;i<ca.length;i++) {
			System.out.println(ca[i]);
		}
	}

}
