//package com.digit.javaTraining.exceptionHandling;
//
//import java.util.Scanner;
//
//class UnderAgeException extends Exception {
//	public String getMessage() {
//		return "Your age is less than 18, hence you are a kid";
//	}
//}
//
//class OverAgeException extends Exception {
//	public String getMessage() {
//		return "Your age is more than 60, hence stop having desires";
//	}
//}
//
//class Candidate1 {
//	int age;
//
//	void getData() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the age: ");
//		age = sc.nextInt();
//	}
//
//	void getVerify() throws Exception {
//		if (age < 18) {
//			UnderAgeException uae = new UnderAgeException();
//			System.out.println(uae.getMessage());
//			throw uae;
//		} else if (age > 60) {
//			OverAgeException oae = new OverAgeException();
//			System.out.println(oae.getMessage());
//			throw oae;
//		} else {
//			System.out.println("Issue the licence");
//		}
//	}
//}
//
//class RTO1 {
//	void grantLicense(Candidate1 c) {
//		try {
//			c.getData();
//			c.getVerify();
//		} 
//		catch (Exception e1) {
//			try {
//				c.getData();
//				c.getVerify();
//			} 
//			catch (Exception e2) {
//				try {
//					c.getData();
//					c.getVerify();
//				} 
//				catch (Exception e3) {
//
//					System.out.println("Go Home");
//				}
//			}
//		}
//	}
//
//	public class prog5 {
//
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			Candidate1 c1 = new Candidate1();
//			RTO1 rto = new RTO1();
//			rto.grantLicense(c1);
//
//		}
//
//	}
//}
