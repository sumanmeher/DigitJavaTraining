package com.digit.javaTraining.basicPatterns;

public class patternDigitInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) { // D
				if (j == 0 || 
					i == 0 && j != (n - 1) || 
					i == n - 1 && j != (n - 1)|| 
					j == n - 1 && i != (n - 1) && i != 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < n; j++) { // I
				if (i == 0 || 
					j == (n - 1) / 2 || 
					i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < n; j++) { // G
				if (i == 0 && j != 0 ||
					j == 0 && i!=0 && i!=n-1||
					i == n - 1 && j <= (n - 1) / 2 && j!=0 || 
					j == (n - 1) / 2 && i >= (n - 1) / 2 && i!=(n-1)/2|| 
					i == (n - 1) / 2 && j >= (n - 1) / 2 && j!=(n-1)/2 && j!=n-1|| 
					j == (n - 1) && i >= (n - 1) / 2 && i!=(n-1)/2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < n; j++) { // I
				if (i == 0 ||
					j == (n - 1) / 2 || 
					i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < n; j++) { // T
				if (i == 0 || 
					j == (n - 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		System.out.println();
		for (int i = 0; i < n; i++) { // I
			for (int j = 0; j < n; j++) {
				if (i == 0 || 
					j == (n - 1) / 2 || 
					i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) { // N
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			for (int j = 0; j < n; j++) { // S
				if (i == 0 && j != 0 || j == 0 && i <= (n - 1) / 2 && i != 0 && i != (n - 1) / 2
						|| i == (n - 1) / 2 && j != 0 && j != (n - 1) || j == (n - 1) && i > (n - 1) / 2 && i != (n - 1)
						|| i == n - 1 && j != n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) { // U
				if (j == 0 && i!=n-1 || i == n - 1 && j!=0 && j!=n-1|| j == n - 1 && i!=n-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) { // R
				if (j == 0  || i == 0 && j!=n-1 || i == (n - 1) / 2 && j > (n - 1) / 2 || j == n - 1 && i < (n - 1) / 2 && i!=0
						|| i == j && j >= (n - 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) { // A
				if (j == 0 && i != 0 || j == (n - 1) && i != 0 || i == 0 && j != 0 && j != (n - 1)
						|| i == (n - 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) { // N
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) { // C
				if (j == 0 && i != 0 && i != n - 1 || i == 0 && j != 0 || i == n - 1 && j != 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) { // E
				if (j == 0 && i != 0 && i != n - 1|| i == 0 && j != 0|| i == (n - 1) / 2 || i == n - 1 && j != 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			
			System.out.println();
		}

	}

}
