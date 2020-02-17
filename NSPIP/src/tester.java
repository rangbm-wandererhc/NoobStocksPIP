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
		watchlistxpath find = new watchlistxpath();
		
		//loop asks
		boolean cont = true;
		while(cont)
		{
			//ask for menu
			System.out.println("Menu");
			System.out.println("=====================");
			System.out.print("Enter '1' to search data for a new company,\n"
					+ "'2' to pull up your custom watchlist, or\n"
					+ "'3' to pull up the help center: " );
			menuInput = in.next();
			
			//search menu
			if(menuInput.trim().equalsIgnoreCase("1"))
			{
				System.out.println("\nEnter the company name to calculate stocks for.");
				System.out.print("Type 'quit' to exit the program: ");
				comp = in.nextLine();
				comp = in.nextLine();
				
				//search google
				if(comp.equalsIgnoreCase("quit"))
					cont = false;
				else
					find.search(comp);
				
				//print basic data
				output.printBasic(find);
				watchlist.storeData(comp);
				find.close();
			}
			
			//watchlist menu
			else if(menuInput.trim().equalsIgnoreCase("2"))
			{
				System.out.println("Your Watchlist:");
			}
			
			//help menu
			else if(menuInput.trim().equalsIgnoreCase("3"))
			{
				learningcenter learn = new learningcenter();
				learn.chooseTopic();
			}
		}	
	}
}
