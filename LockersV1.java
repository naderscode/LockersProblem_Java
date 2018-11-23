/*
	Name: Nader K 
   Lockers - version 1
	Date: February 27, 2012
	File: LockersV1.java
	Purpose:This program simulates the "Locker problem". It uses for loops to check for the divisors
			  of each locker number to see if it is odd or even. If it is odd that locker will end up closed.
			  This program outputs the count of lockers that remain open after the game is over,
			  and also outputs a list of all the lockers that are open.
	
*/

import java.util.*;

public class LockersV1
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		int numLockers;  //total number of lockers
		System.out.print("Enter the number of Lockers: ");// prompt the user to enter required number of lockers
        
		System.out.flush();     // flush the buffer
		numLockers = input.nextInt();  // get user input of number of lockers.
		
		int openLockers = 0;
		int divisors = 0;
		
		System.out.println();		
		System.out.println("The open lockers are: ");
		//go through each locker to determine if it ends up open or closed.
		for(int locker = 1; locker <= numLockers; locker++)
		{
		
			//for each lockernumber check its divisors
			for(int div = 1; div <= locker; div++)
			{
				
				if(locker % div == 0)  //check to see what the divisors are.
				divisors++;					// keep track of the count of divisors of each locker number
								
			}// end nested for	
			
			
            /* check to see if the divisors for that locker number are odd, because if they are odd, the locker will remain open.*/
			if(divisors % 2 !=0) 
			{
					openLockers++;  // keep track of the count of open lockers (that have an odd number of divisors)
					System.out.print(locker + " ");  // print the open locker number followed by a space.
			}
			divisors = 0;		// reset the divisors count to zero for that locker, in order to keep track of the next
								// locker, and so on.		
		}// end for
			
			System.out.println();
			System.out.println("There are " + openLockers + " open lockers.");	// print the count of open lockers.
			
				
		}//end main

}//end class
