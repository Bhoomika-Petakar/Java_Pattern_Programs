package com.kodnest.pattern;
import java.util.*;
public class Pattern23 {
	public static void main(String[] args)
    {
    	// Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        // Print i number of stars
        
        for(int i=1; i<= rows; i++)
        {
            if(i%2 != 0)
            {
                for(int j=1; j<= rows/2+1; j++)
                {
                    System.out.print("*  ");
                }
            }
            else
            {
            	for(int j=1; j<= rows/2; j++)
                {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
        scanner.close();
    }
}
