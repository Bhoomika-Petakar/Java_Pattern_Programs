package com.kodnest.pattern;

import java.util.*;

public class Pattern10 {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int i, j;
	int n = sc.nextInt();
	// solid rhombus
	System.out.println("Solid Rhombus");
	System.out.println();
	for(i = 0; i < n; i++)
	{
	for(j = 0; j < n - i; j++)
	{
	System.out.print(" ");  // leading spaces
	}
	for(j = 0; j < n; j++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
	
	}
	}
	