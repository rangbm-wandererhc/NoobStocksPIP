/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Your Mom
 * @version 2/16/2020
 */

public class output
{
	public output()
	{
	}
	
	public static void printBasic(watchlistxpath find)
	{
		System.out.println("\nCompany: " + find.getXpath(0));
		System.out.print("Value: " + find.getXpath(1));
		System.out.print("  USD: " + find.getXpath(2));
		System.out.println(" " + find.getXpath(3) + "\n");
			
		System.out.printf("%-12s %-12s %-12s %-6s\n","Open: ", find.getXpath(4), "Div yield: ", find.getXpath(9));
		System.out.printf("%-12s %-12s %-12s %-6s\n", "High: ", find.getXpath(5), "Prev close: ", find.getXpath(10));
		System.out.printf("%-12s %-12s %-12s %-6s\n", "Low: ", find.getXpath(6), "52-wk high: ", find.getXpath(11));
		System.out.printf("%-12s %-12s %-12s %-6s\n", "Mkt cap: ", find.getXpath(7), "52=wk low: ", find.getXpath(12));
		System.out.printf("%-12s %-12s\n\n", "P/E ratio: ", find.getXpath(8));
		
	}	
}

