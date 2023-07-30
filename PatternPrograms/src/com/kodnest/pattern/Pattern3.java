package com.kodnest.pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int num = 1;
        // outer loop to handle number of rows
        for (int i = 1; i <= 6; i++) {
            // inner loop to handle number of columns
            for (int j = 1; j <= i; j++) {
                // printing value of num in each iteration.
                System.out.print(num + " ");
                // increasing the value of num.
                num++;
            }
  // printing new line for each row
            System.out.println();
        }
    }
}
