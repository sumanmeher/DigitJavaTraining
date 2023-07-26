package com.digit.javaTraining.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Division Operation");
			System.out.println("Enter the numerator: ");
			int num = sc.nextInt();

			System.out.println("Enter the denominator: ");
			int den = sc.nextInt();

			int res = num / den;
			System.out.println("Division result is: " + res);

			System.out.println("Array Operation");
			System.out.println("Enter array size: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			int arr1[] = null;

			System.out.println("Enter the position to which value has to be added: ");
			int pos = sc.nextInt();

			System.out.println("Enter the value to be added: ");
			int val = sc.nextInt();

			arr[pos] = val;
			System.out.println("Data added into the array");

		} catch (ArithmeticException e1) {
			System.out.println("ArithmeticException");

		} catch (NegativeArraySizeException e2) {
			System.out.println("NegativeArraySizeException");

		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("ArrayIndexOutOfBoundsException");

		} catch (InputMismatchException e4) {
			System.out.println("InputMismatchException");

		} catch (NullPointerException e5) {
			System.out.println("NullPointerException");

		} catch (Exception e6) {
			System.out.println("Exception Handled by generic catch");
		}

	}

}
