/*
	Name: Nader K
	Lockers - version 2
	Date: February 28, 2012
	File: LockersV2.java
	Purpose:This program simulates the "Locker problem" using a boolean array of a length specified by the user.
				Two nested loops simulates the actions of each student as they go through their respective lockers
				toggling their states, i. e. opening or closing them. A third loop iterates through the array and 
				finds all open lockers. This program outputs the count of lockers that remain open
				after the game is over, and also outputs a list of all the lockers that are open.
	
*/

import java.util.*;

public class LockersV2
{
	static Scanner in = new Scanner(System.in);
	
	public static void main (String[]args)
	{
			int input;  // number of lockers variable
			System.out.print("Enter the number of Lockers: ");  // prompt the user to enter required number of lockers
			System.out.flush();   // flush the buffer  
			input = in.nextInt();// get user input of number of lockers.
	
			//create an array of lockers with a state of true (open) or false (closed)
			boolean[]lockers= new boolean[input+1]; 
				int numLockers = lockers.length; // store the length of array into numLockers   variable to be used .
															//in the code it is more memory efficient to store it in a variable
															// to be reused vs. checking for array length each time.
			
			//These nested loops simulates the actions of each student as they go through the respective lockers toggling their state  	
			for (int student = 1; student <= numLockers ; student++)
			{
			
				for(int locker = student; locker < numLockers; locker += student) // the nth student toggles every nth locker, etc
				lockers[locker] = !lockers[locker];      //toggle between open and close
			
			}
			
			//keep track of open lockers
			int openLockers = 0;
			System.out.println("The open lockers are: ");
			for (int open = 1; open <numLockers; open++)  // loop through the array and find all open lockers
				if(lockers[open])
				{
					openLockers++;  //variable accumulates number of open lockers.
					
					System.out.print(open + " ");	//print open lockers individually sepearated by a space
				}
			
			System.out.println();	
			System.out.println("There are " + openLockers + " lockers that remain open." ); // print total of open lockers
		
		}// end main
		
	}//end class