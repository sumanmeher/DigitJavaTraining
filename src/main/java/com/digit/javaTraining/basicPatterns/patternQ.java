package com.digit.javaTraining.basicPatterns;

public class patternQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) { // Q
				if (i == 0 && j <= (n - 1) / 2 || j == 0 && i <= (n - 1) / 2 || i == (n - 1) / 2 && j <= (n - 1) / 2
						|| j == (n - 1) / 2 && i <= (n - 1) / 2 || i == j && i > (n / 4) && j <= (3 * n) / 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			for (int j = 0; j < n; j++) { // Q (another way)
				if (i == 0 && j < (3 * n) / 4 && j != 0 || i == (3 * n) / 4 && j < (3 * n) / 4 && j != 0
						|| j == 0 && i < (3 * n) / 4 && i != 0 || j == (3 * n) / 4 && i < (3 * n) / 4 && i != 0
						|| i == j && i > (n - 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

			System.out.println();
		}
	}

}
