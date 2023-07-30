package com.kodnest.pattern;

public class Pattern25 {
	public static void main(String args[])
	{
	
	int i, j;
	
	int num1 = 5 / 2 * 3;
	// right arrow
	System.out.println("Arrow");
	System.out.println();
	for(i = 0; i < 5; i++)
	{
	for(j = 0; j < 5; j++)
	{
	// center horizontal, upper right diagonal, bottom right diagonal
		if(i == 5 / 2 || j - i == 5 / 2 || i + j == num1)
	System.out.print("*");
	else
	System.out.print(" ");
	}
	System.out.println();
	}
	
	}
}
