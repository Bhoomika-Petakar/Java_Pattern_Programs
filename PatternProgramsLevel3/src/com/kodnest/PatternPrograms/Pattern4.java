package com.kodnest.PatternPrograms;

public class Pattern4 {
	public static void main(String[] args) {

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (int k = 1; k <= 5; k++) {
			for (int i = 5; i >= k; i--) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
