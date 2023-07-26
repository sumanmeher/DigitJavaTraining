package com.digit.javaTraining.basicPatterns;

public class patternName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) { // S
				if (i == 0 || j == 0 && i <= (n - 1) / 2 || i == (n - 1) / 2 || j == (n - 1) && i >= (n - 1) / 2
						|| i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) { // U
				if (j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) { // M
				if (j == 0 || i == j && j <= (n - 1) / 2 || (i + j) == (n - 1) && i <= (n - 1) / 2 || j == n - 1) {
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
			System.out.println();

		}

	}

}
