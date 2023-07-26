package com.digit.javaTraining.oopsCodes;

import java.util.Scanner;

abstract class shapes {
	float area;
	Scanner sc = new Scanner(System.in);

	abstract void getData();

	abstract void calculate();

	void display() {
		System.out.println("Area= " + area);

	}
}

class circle extends shapes {
	private static float pi = 3.14f;
	float radius;

	public static float getPi() {
		return pi;
	}

	public static void setPi(float pi) {
		circle.pi = pi;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	void getData() {
		System.out.println("Enter the radius of the Circle: ");
		radius = sc.nextFloat();
	}

	void calculate() {
		area = pi * radius * radius;
	}

}

class square extends shapes {
	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	void getData() {
		System.out.println("Enter the side of the Square: ");
		side = sc.nextFloat();
	}

	void calculate() {
		area = side * side;

	}
}

class rectangle extends shapes {
	private float length;
	private float breadth;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	void getData() {
		System.out.println("Enter the length of the Rectangle: ");
		length = sc.nextFloat();
		System.out.println("Enter the breadth of the Rectangle: ");
		breadth = sc.nextFloat();
	}

	void calculate() {
		area = length * breadth;
	}

}

class geometry {
	void usedShaped(shapes ref) {
		ref.getData();
		ref.calculate();
		ref.display();
	}
}

public class launch10 {

	public static void main(String[] args) {

		geometry g = new geometry();
		circle c = new circle();
		square sq = new square();
		rectangle r = new rectangle();

		g.usedShaped(c);
		g.usedShaped(sq);
		g.usedShaped(r);
	}

}
