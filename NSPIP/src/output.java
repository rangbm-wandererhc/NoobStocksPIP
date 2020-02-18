import java.util.ArrayList;
import java.util.*;
/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Your Mom
 * @version 2/16/2020
 */

public class output
{
	
//	public static void printstockcalc(watchlistxpath find)
//	{
//		System.out.println("\nCompany: " + find.getXpath(0));
//		System.out.print("Value: " + find.getXpath(1));
//		System.out.print("  USD: " + find.getXpath(2));
//		System.out.println(" " + find.getXpath(3) + "\n");
//			
//		System.out.printf("%-12s %-12s %-12s %-6s\n","Open: ", find.getXpath(4), "Div yield: ", find.getXpath(9));
//		System.out.printf("%-12s %-12s %-12s %-6s\n", "High: ", find.getXpath(5), "Prev close: ", find.getXpath(10));
//		System.out.printf("%-12s %-12s %-12s %-6s\n", "Low: ", find.getXpath(6), "52-wk high: ", find.getXpath(11));
//		System.out.printf("%-12s %-12s %-12s %-6s\n", "Mkt cap: ", find.getXpath(7), "52=wk low: ", find.getXpath(12));
//		System.out.printf("%-12s %-12s\n\n", "P/E ratio: ", find.getXpath(8));
//		
//	}	
	
	//name of company as parameter
	public static void printstockcalc() {
		
	}
	
	// no parameter
	public static void printcrypt() {
		
	}
	
	//term as parameter
	public static void printlearningcenter() {
		
	}
	
	//no parameter
	public static void printrecommendation() {
		System.out.print("\n\nLoading...\n");
		//most actives
		ArrayList<ArrayList> mostactives = new ArrayList<ArrayList>();
		ArrayList<String> activecompany = new ArrayList<String>();
		ArrayList<String> activeprice = new ArrayList<String>();
		ArrayList<String> activechange = new ArrayList<String>();
		ArrayList<String> activeperchange = new ArrayList<String>();
		mostactives = recommendation.mostactives();
		activecompany = mostactives.get(0);		
		activeprice = mostactives.get(1);		
		activechange = mostactives.get(2);		
		activeperchange = mostactives.get(3);	
		
		
		System.out.printf("%10s\n\n","Most actives");

		System.out.printf("%5s %10s %17s %25s \n", "Company", "Price", "Change", "Percent Change");
		for(int i = 0 ; i<activecompany.size(); i++) {
			System.out.printf("%5s %10s %17s %25s \n", activecompany.get(i), activeprice.get(i), activechange.get(i), activeperchange.get(i));
			
		}
		
		//top gainers
		System.out.println("Top Gainers");
		ArrayList<ArrayList> gainers = new ArrayList<ArrayList>();
		ArrayList<String> gaincompany = new ArrayList<String>();
		ArrayList<String> gainprice = new ArrayList<String>();
		ArrayList<String> gainchange = new ArrayList<String>();
		ArrayList<String> gainperchange = new ArrayList<String>();
		gainers = recommendation.gainers();
		gaincompany = gainers.get(0);		
		gainprice = gainers.get(1);		
		gainchange = gainers.get(2);		
		gainperchange = gainers.get(3);	
		
		for(int i = 0 ; i<gaincompany.size(); i++) {
			System.out.printf("%s \t",gaincompany.get(i));
			System.out.printf("%s \t",gainprice.get(i));
			System.out.printf("%s \t",gainchange.get(i));
			System.out.printf("%s \t",gainperchange.get(i));
			System.out.println();
		}
		
		//top losers
		System.out.println("Top Losers");
		ArrayList<ArrayList> losers = new ArrayList<ArrayList>();
		ArrayList<String> losecompany = new ArrayList<String>();
		ArrayList<String> loseprice = new ArrayList<String>();
		ArrayList<String> losechange = new ArrayList<String>();
		ArrayList<String> loseperchange = new ArrayList<String>();
		losers = recommendation.losers();
		losecompany = losers.get(0);		
		loseprice = losers.get(1);		
		losechange = losers.get(2);		
		loseperchange = losers.get(3);	
		
		for(int i = 0 ; i<losecompany.size(); i++) {
			System.out.printf("%s \t",losecompany.get(i));
			System.out.printf("%s \t",loseprice.get(i));
			System.out.printf("%s \t",losechange.get(i));
			System.out.printf("%s \t",loseperchange.get(i));
			System.out.println();
		}
	}
	
	//no parameter
//	public static void printwatchlist{
//		
//	}
}