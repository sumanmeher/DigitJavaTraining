package com.digit.javaTraining.stringCodes;

public class stringCode5 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Rama & ");
		StringBuilder sb2 = new StringBuilder("Sita");
		
		sb1.append(sb2);
		System.out.println(sb1);
		
		System.out.println(sb1.capacity());
		
		sb1.ensureCapacity(200);
		System.out.println(sb1.capacity());
		
		System.out.println(sb1.getClass());
		
		sb1.reverse();
		System.out.println(sb1);
		
		sb1.replace(5, 6, "and");
		System.out.println(sb1);
		
		sb1.delete(5, 8);
		System.out.println(sb1);

	}

}
