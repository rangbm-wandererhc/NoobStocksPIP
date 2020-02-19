import java.util.ArrayList;
import java.io.IOException;
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
	//name of company as parameter
	public static void printstockcalc(String name) {
		
		System.out.println("\nLoading ...\n");
		
		stockcalc find = new stockcalc();
		find.search(name);
		if(find.getXpath(0).equals("N/A")) {
			System.out.println("Company not found. Please enter valid company.");
		}
		else {
			System.out.println("==================================================================");
			System.out.println("\nCompany: " + find.getXpath(0));
			System.out.print("Value: " + find.getXpath(1));
			System.out.print("  USD: " + find.getXpath(2));
			System.out.println(" " + find.getXpath(3) + "\n");
				
			System.out.printf("%-12s %-12s %-12s %-6s\n","Open: ", find.getXpath(4), "Div yield: ", find.getXpath(9));
			System.out.printf("%-12s %-12s %-12s %-6s\n", "High: ", find.getXpath(5), "Prev close: ", find.getXpath(10));
			System.out.printf("%-12s %-12s %-12s %-6s\n", "Low: ", find.getXpath(6), "52-wk high: ", find.getXpath(11));
			System.out.printf("%-12s %-12s %-12s %-6s\n", "Mkt cap: ", find.getXpath(7), "52=wk low: ", find.getXpath(12));
			System.out.printf("%-12s %-12s\n\n", "P/E ratio: ", find.getXpath(8));
			System.out.println("==================================================================");
		}

		find.close();
	}
	
	// no parameter
	public static void printcrypt() {
		System.out.print("\nLoading...\n\n");
		
		//Cryptocurrency
		ArrayList<ArrayList> crypto = new ArrayList<ArrayList>();
		ArrayList<String> currency = new ArrayList<String>();
		ArrayList<String> price = new ArrayList<String>();
		ArrayList<String> change = new ArrayList<String>();
		ArrayList<String> perchange = new ArrayList<String>();
		ArrayList<String> lastupdated = new ArrayList<String>();
		ArrayList<String> marketcap = new ArrayList<String>();
		ArrayList<String> circulatingsupply = new ArrayList<String>();
		ArrayList<String> volume = new ArrayList<String>();
		
		crypto = crypt.cryptocurrency();
		
		currency = crypto.get(0);		
		price = crypto.get(1);		
		change = crypto.get(2);		
		perchange = crypto.get(3);	
		lastupdated = crypto.get(4);	
		marketcap = crypto.get(5);	
		circulatingsupply = crypto.get(6);	
		volume = crypto.get(7);	

		System.out.printf("%22s %20s %20s %20s %20s %20s %20s \n", "Currency", "Price", "Change", "Percent Change", "Last Updated", "Market Cap", "Circulating Supply");
		System.out.println("=====================================================================================================================================================");
		for(int i = 0 ; i< currency.size(); i++) {
			System.out.printf("%1s %20s %20s %20s %20s %20s %20s %20s \n", currency.get(i).trim(), price.get(i).trim(), change.get(i).trim(), perchange.get(i).trim(), lastupdated.get(i).trim(), marketcap.get(i).trim(), circulatingsupply.get(i).trim(), volume.get(i).trim());
		}	
	}
	
	//term as parameter
	public static void printlearningcenter() {
		learningcenter learn = new learningcenter();
		boolean cont = true;
		while(cont)
		{
			String input = learn.choose();
			String ret = learn.chooseTopic(input);
			if(ret.equals("false"))
			{
				cont = false;
			}
			else
				System.out.println("\n"+ ret);
		}
	}
	
	//no parameter
	public static void printrecommendation() {
		
		System.out.print("\nLoading...\n\n");
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
		
		System.out.printf("%-45s %12s %20s %25s \n", "Company", "Price", "Change", "Percent Change");
		System.out.println("============================================================================================================");
		System.out.println("Most actives: ");
		for(int i = 0 ; i<activecompany.size(); i++) {
			System.out.printf("%-45s %12s %20s %25s \n", activecompany.get(i), activeprice.get(i), activechange.get(i), activeperchange.get(i));
			
		}
		
		//top gainers
		System.out.print("\nLoading...\n\n");
		System.out.println("\nTop Gainers:");
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
			System.out.printf("%-45s %12s %20s %25s \n", gaincompany.get(i), gainprice.get(i), gainchange.get(i), gainperchange.get(i));
		}
		
		//top losers
		System.out.print("\nLoading...\n\n");
		System.out.println("\nTop Losers: ");
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
			System.out.printf("%-45s %12s %20s %25s \n", losecompany.get(i), loseprice.get(i), losechange.get(i), loseperchange.get(i));
		}
	}
	
	//no parameter
	public static void printwatchlist() throws IOException{
		ArrayList<String> companylist = watchlist.list();
		System.out.println("\nYour current Watchlist\n");
		for(int i = 0; i<companylist.size(); i++) {
			System.out.print((i+1)+".");
			System.out.println(companylist.get(i));
		}
	}
	public static void printwatchlist_stocksinfo() throws IOException {
		ArrayList<String> companylist = watchlist.list();
		for(int i =0; i<companylist.size(); i++) {
			printstockcalc(companylist.get(i));
		}
	}
}