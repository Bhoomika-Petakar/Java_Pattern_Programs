package com.kodnest.pattern;
import java.util.*;
public class Pattern13 {
	public static void main(String[] args)

	{

	Scanner sc = new Scanner(System.in);

	//take a row-value from the user

	System.out.println("Enter The rows number:");

	int rows = sc.nextInt();



	for (int i = 1; i <= rows; i++)

	{

	
		for(int j=rows;j>=i;j--){

	

	System.out.print(j+" ");

	}

	System.out.println();

	}

	//to close all the resources

	sc.close();

	}
	}



