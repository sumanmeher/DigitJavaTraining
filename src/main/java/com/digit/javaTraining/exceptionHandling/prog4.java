package com.digit.javaTraining.exceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "Your age is less than 18, hence you are a kid";
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "Your age is more than 60, hence stop having desires";
	}
}

class Candidate{
	int age;
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age=sc.nextInt();
	}
	void getVerify()throws Exception {
		if(age<18) {
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}else if(age>60) {
			OverAgeException oae=new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}else {
			System.out.println("Issue the licence");
		}
	}
}
class RTO{
	void grantLicense(Candidate c) {
		try {
		c.getData();
		c.getVerify();
		}catch(Exception e) {
			System.out.println("Exception Handled");
		}
	}
}
public class prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c1=new Candidate();
		RTO rto=new RTO();
		rto.grantLicense(c1);

	}

}
