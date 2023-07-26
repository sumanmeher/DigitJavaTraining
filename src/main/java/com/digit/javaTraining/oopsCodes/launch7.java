package com.digit.javaTraining.oopsCodes;

class calculator {
	int add(int a, int b) {
		return a + b;
	}

	float add(float a, float b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	double add(int a, int b, double c) {
		return a + b + c;
	}

	float add(int a, float b) {
		return a + b;
	}

	double add(int a, float b, double c) {
		return a + b;
	}

	float add(float a, int b) {
		return a + b;
	}
}

public class launch7 {

	public static void main(String[] args) {
		calculator c1 = new calculator();
		int a = 10, b = 20, c = 30;
		float m = 30.7f, n = 20.7f, o = 10.7f;
		double p = 300.37, q = 200.37, r = 100.37;

		System.out.println(c1.add(a, m));
		System.out.println(c1.add(m, n));
		System.out.println(c1.add(a, b, p));
		System.out.println(c1.add(a, m, p));

	}

}
