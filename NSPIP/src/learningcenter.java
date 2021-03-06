/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Daniel Park, Harang Kim
 * @version 2/16/2020
 */

import java.util.ArrayList;
import java.util.Scanner;

public class learningcenter
{
	private String input, newInput;
	private ArrayList<String> terms = new ArrayList<String>();
	
	public learningcenter()
	{
		terms.add("open");
		terms.add("high");
		terms.add("low");
		terms.add("mkt cap");
		terms.add("p/e ratio");
		terms.add("div yield");
		terms.add("prev close");
		terms.add("52-wk high");
		terms.add("52-wk low");
	}
	
	public String choose()
	{
		Scanner in = new Scanner(System.in);
		
		//ask for input of term
		System.out.println("\n\tHelpCenter");
		System.out.println("========================================");
		System.out.print("Terms:");
		for(String n : terms)
		{
			System.out.print(" " + n + ",");
		}
		
		System.out.print("\nEnter one of the terms to be explained. \nType 'quit' to quit: ");
		input = in.nextLine();
		return input;
		
	}
	
	public String chooseTopic(String input)
	{
		//check input validity
		newInput = input.trim();
		for(int x = 0; x < terms.size(); x++)
		{
			if(input.equalsIgnoreCase(terms.get(x)))
			{
				if(x == 0)
					return explainOpen();
				else if(x == 1)
					return explainHigh();
				else if(x == 2)
					return explainLow();
				else if(x == 3)
					return explainMarkCap();
				else if(x == 4)
					return explainRatio();
				else if(x == 5)
					return explainDiv();
				else if(x == 6)
					return explainClose();
				else if(x == 7)
					return explainWkHighLow();
			}
		}
		if(input.equalsIgnoreCase("Quit"))
		{
			return "false";
		}
		return "Error.";
	}
	
	public String explainOpen()
	{
		return "In the stock markets, open refers to the beginning of the trading\n"
					+ "day or the price of a security at the beginning of the trading day.";
	}
	
	public String explainHigh()
	{
		return "Today's high refers to a security's intraday high trading price. Today's\n"
				+ "high is the highest price at which a stock traded during the course of the trading\n"
				+ "day. Today's high is typically higher than the closing or opening price. More often\n"
				+ "than not this is higher than the closing price.";
	}
	
	public String explainLow()
	{
		return "Today's low is a security's intraday low trading price. Today's low is\n"
				+ "the lowest price at which a stock trades over the course of a trading day.";
	}
	
	public String explainMarkCap()
	{
		return "Market capitalization refers to the total dollar market value of\n"
				+ "a company's outstanding shares of stock. Commonly referred to as \"market cap,\"\n"
				+ "it is calculated by multiplying the total number of a company's outstanding shares\n"
				+ " by the current market price of one share.";
	}
	
	public String explainRatio()
	{
		return "The price-to-earnings ratio (P/E ratio) is the ratio for valuing a company\n"
				+ "that measures its current share price relative to its per-share earnings (EPS). The\n"
				+ "price-to-earnings ratio is also sometimes known as the price multiple or the earnings multiple.";
	}
	
	public String explainDiv()
	{
		return "The dividend yield is the ratio of a company's annual dividend compared to its share price.\n"
				+ "It is calculated by dividing the annual dividend by the share price.";
	}
	
	public String explainClose()
	{
		return "Previous close is a security's closing price on the preceding time period of the one being\n"
				+ "referenced. Previous close almost always refers to the prior day's final price of a security when the\n"
				+ "market officially closes for the day. It can apply to a stock, bond, commodity, futures or option\n"
				+ "contract, market index, or any other security.";
	}
	
	public String explainWkHighLow()
	{
		return "A 52-week high/low is the highest and lowest price at which a stock has traded during the\n"
				+ "previous year. It is a technical indicator used by some traders and investors who view the 52-week\n"
				+ "high or low as an important factor in determining a stock's current value and predicting future price movement.";
	}

}
