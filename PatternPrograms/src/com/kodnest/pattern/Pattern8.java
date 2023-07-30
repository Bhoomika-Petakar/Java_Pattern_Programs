package com.kodnest.pattern;

public class Pattern8 {
	public static void main(String[] args) {
	int n = 6;
		for (int i = 1; i <= n; i++) {

			// inner loop to print spaces.
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			
			

			for (int k = 1; k <= (2 * i - 1); k++) {
				// printing stars.
				if (k == 1 || k == (2 * i - 1)) {
					System.out.print("*");
				}
				// printing spaces.
				else {
					System.out.print(" ");
				}
			}

			System.out.println("");
		}

		for (int a = n; a >= 1; a--) {

			// inner loop to print spaces.
			for (int j = a; j < n; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * a - 1); k++) {
				// printing stars.
				if (k == 1 || k == (2 * a - 1)) {
					System.out.print("*");
				}
				// printing spaces.
				else {
					System.out.print(" ");
				}
			}

			System.out.println("");
		}
		

	}

}
