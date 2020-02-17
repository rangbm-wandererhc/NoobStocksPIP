/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Your Mom
 * @version 2/16/2020
 */


import java.util.Scanner;

public class tester
{
	public static String comp, menuInput;
	
	public static void main(String[] args)
	{
		//declare scanner and objects
		Scanner in = new Scanner(System.in);
		
		//loop asks
		boolean cont = true;
		while(cont)
		{
			//ask for menu
			System.out.println("\tMenu");
			System.out.println("=====================");
			System.out.print("Enter\n"
					+ "'1' to search data for a new company\n"
					+ "'2' to pull up your custom watchlist, or\n"
					+ "'3' to pull up the help center,\n"
					+ "'4' to pull up cryptocurrency,\n"
					+ "'5' for recommendations, \n"
					+ "'6' to quit" );
			System.out.print("\ninput: ");
			menuInput = in.next();
			
			if(menuInput.equals("1")) {
				//ask user for company
				
				//call stockcalc in output class
				//gives company name to output class
			}
			else if(menuInput.equals("2")) {
				//prints out current watchlist if exist
				
				// if you want to add watch list
					//add company name to watchlist class
				// else if you want to delete
					//delete company name to watchlist class	
				// else if you want to see your watchlist
					//call output class
			}
			else if(menuInput.equals("3")) {
				//ask user for terms to explain
				
				//gives term to output class to print
			}
			else if(menuInput.equals("4")) {
				//prints cryptocurrency values through output class
			}
			else if(menuInput.equals("5")) {
				//prints recommendations thorhghosaodf output class
				output.printrecommendation();
			}
			else if(menuInput.equals("6")) {
				
			}
			//search menu
			
		}	
	}
}