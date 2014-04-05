/*	
	Name: Nader K
   Lockers - version 3
	Date: February 27, 2012
	Purpose: This program simulates the "Locker problem". It uses for loops to check for the divisors
			  of each locker number to see if it os odd or even. If it is odd that locker will end up closed.
			  This program outputs the count of lockers that rremain open after the game is over,
			  and also outputs a list of all the lockers that are open.


*/
import java.util.*;

public class LockersV4
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		double lockers;  //total number of lockers
		int openLockers;
				
		System.out.print("Enter the number of Lockers: ");
		System.out.flush();     
		lockers = input.nextInt();
		int open = 0;
		open = (int) Math.floor(Math.sqrt(lockers));
		
		System.out.println();		
		System.out.println("The open lockers are: ");
		for(int i=1; i<=open; i++)
		{
			openLockers = i*i;
			System.out.print(openLockers + ", ");	
		
		}
		System.out.println();	
		System.out.println("There are " + open + " open lockers.");	
			
				
		}//end main

}//end class