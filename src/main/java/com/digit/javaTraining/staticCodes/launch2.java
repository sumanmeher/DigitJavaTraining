package com.digit.javaTraining.staticCodes;

import java.util.Scanner;

class Employee{
	String name;
	String id;
	static int ctc;
	
	static {
		ctc=450000;
	}
	
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		name= sc.nextLine();
		
		System.out.println("Enter Employee ID: ");
		id=sc.nextLine();		
	}
	void display() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Salary: Rs. "+ctc+" per annum");
	}
}

public class launch2 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getData();
		e1.display();
		System.out.println();
		
		Employee e2=new Employee();
		e2.getData();
		e2.display();
		System.out.println();
		
		Employee e3=new Employee();
		e3.getData();
		e3.display();
	}

}
