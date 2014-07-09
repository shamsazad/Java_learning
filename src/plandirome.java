/*
 * Developer = Shams Azad
 * Date = 22/06/2014
 * Work = Palindrome
 * shamsazad
 */

import java.util.Scanner;


public class plandirome {
	
	public static void main(String a[])
	{
		System.out.println("Welcome to Palindrome Finder\n");
		System.out.println("\n=========================================================\n");
		 
		//User input
		System.out.println("Enter the array need to check for palindrome");
		Scanner b = new Scanner(System.in);
		String palindrom = b.nextLine();
		
		//Checking Palindrome
		palindrom_d c = new palindrom_d();
		c.checker(palindrom);
		
		if(c.checker(palindrom)==true)
		{
			System.out.println("Palindrome found");
		}
		else
			System.out.println("Try again, not a Palindrome");
		
		b.close();
		
	}

}
