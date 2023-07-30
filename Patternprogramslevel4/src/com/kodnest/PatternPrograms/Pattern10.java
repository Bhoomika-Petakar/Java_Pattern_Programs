package com.kodnest.PatternPrograms;

public class Pattern10 {
	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {

				System.out.print(" ");

			}
			for (int i = 5; i >= j; i--) {

				System.out.print("*");

			}
			System.out.println();

		}

		for (int j = 1; j <= 5; j++) {
			for (int i = 5; i >= j; i--) {

				System.out.print(" ");

			}
			for (int i = 1; i <= j; i++) {

				System.out.print("*");

			}
			System.out.println();

		}

		System.out.println();

	}

}
