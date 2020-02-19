/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Your Mom
 * @version 2/16/2020
 */


import java.io.IOException;
import java.util.Scanner;

public class tester
{
	public static String comp, menuInput;
	
	public static void main(String[] args) throws IOException
	{
		//declare scanner and objects
		Scanner in = new Scanner(System.in);
		
		//loop asks
		boolean cont = true;
		while(cont)
		{
			//ask for menu
			System.out.println("\n\tMenu");
			System.out.println("==========================================");
			System.out.print("Please enter one of the following options:\n"
					+ "'1' to search data for a new company\n"
					+ "'2' to pull up your custom watchlist, or\n"
					+ "'3' to pull up the help center,\n"
					+ "'4' to pull up cryptocurrency,\n"
					+ "'5' for recommendations, \n"
					+ "'6' to quit" );
			System.out.print("\nInput: ");
			menuInput = in.next();
			
			if(menuInput.equals("1"))
			{
				System.out.print("\nEnter a company to get data for: ");
				comp = in.nextLine();
				comp = in.nextLine();
				
				output.printstockcalc(comp);
				
			}
			else if(menuInput.equals("2"))
			{				
				boolean wathclistcont = true;
				while(wathclistcont) {
					output.printwatchlist();
					System.out.println("\nPlease enter one of the following options: \n");
					System.out.println("'1' to pull up your stocks information");
					System.out.println("'2' to add new stock");
					System.out.println("'3' to delete your stock in the watchlist");
					System.out.println("'4' to exit your Watchlist");
					System.out.print("Input:");
					
					String watchlistmode = in.nextLine();
		
					if(watchlistmode.equals("1")) {
						 output.printwatchlist_stocksinfo();
					}
					else if(watchlistmode.equals("2")) {
						System.out.println("Please enter the company you want to add");
						System.out.print("Input: ");
						String company = in.nextLine();
						watchlist.add(company);
					}
//					else if(watchlistmode.equals("3")) {
//						System.out.println("Please enter the company you want to delete");
//						System.out.print("Input: ");
//						String company = in.nextLine();
//						watchlist.delete(company);
//					}
					else if(watchlistmode.equals("3")) {
						wathclistcont = false;
					}
					// else if you want to see your watchlist
						//call output class
				}
				
			}
			else if(menuInput.equals("3")) {
				output.printlearningcenter();
				
			}
			else if(menuInput.equals("4")) {
				output.printcrypt();
			}
			else if(menuInput.equals("5")) {
				output.printrecommendation();
			}
			else if(menuInput.equals("6")) {
				break;
			}
			//search menu
			
		}			
	}
}