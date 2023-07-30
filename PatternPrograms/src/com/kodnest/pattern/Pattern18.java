package com.kodnest.pattern;

public class Pattern18 {
	public static void main(String[] args) {
		System.out.println("________Pascal's Triangle_________");
		System.out.println();
        
        int n = 5;
  
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
  
    }
}
