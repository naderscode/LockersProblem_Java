/*	

	Name: Nader K
	Lockers - version 3
	Date: February 29, 2012
	File: LockersV3.java
	Purpose: This program solves the locker problem. It also outputs the count of lockers that remain open
				after the game is over, and also outputs a list of all the lockers that are open.
				Here, the locker problem is solved through mathematical reasoning and observatio
	Algorithm: The reasoning goes like this: If the number of divisors of a certain locker is odd, then that locker
				  remains open at the end. Only a number that is a perfect square can have an odd number of factors. 
				  All we have to do is find the perfect square and count them. All we need to count them is get the
				  square root of the largest perfect square less than or equal the given number of lockers, rounded down
				  to the nearest integer. This leaves the computer with just the task of taking the user's input, 
				  and calculating it's square root. This is efficient.

*/

import java.util.*;

public class LockersV3
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		double lockers;  //total number of lockers
		int openLockers;
				
		System.out.print("Enter the number of Lockers: ");	//prompt user
		System.out.flush();     
		lockers = input.nextInt();  // get user input and store it in variable "lockers"
		int open = 0;					//declare and initialize variable "open" to zero.	
		open = (int) Math.floor(Math.sqrt(lockers)); /*calculate the square root of the number of lockers, to get the numberof perfect square below it, and hence get the number of open lockers.*/
		
		/*print the open lockers, which are the perfect squares up to the square root of the number of lockers*/
		System.out.println();		
		System.out.println("The open lockers are: ");
		for(int i=1; i<=open; i++)
		{
			openLockers = i * i;
			System.out.print(openLockers + ", ");	
		
		}
		//print the number of open lockers
		System.out.println();	
		System.out.println("There are " + open + " open lockers.");	
			
				
		}//end main

}//end class