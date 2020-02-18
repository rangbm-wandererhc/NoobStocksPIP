/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Your Mom
 * @version 2/16/2020
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class watchlist
{
	private static String decide;
	private static File file;
	private static Scanner inFile;
	private static PrintWriter outFile;
	private static Scanner in;
	
	public watchlist() throws FileNotFoundException
	{
		outFile = new PrintWriter(new File("watchlist.txt"));
		file = new File("watchlist.txt");
		inFile = new Scanner(file);
		in = new Scanner(System.in);
	}
	
	public void storeData(String input) throws FileNotFoundException
	{		
		boolean error = true;
		while(error)
		{
			System.out.print("Would you like to add this data to your watch list? Enter 'yes' or 'no: ");
			decide = in.nextLine();
			
			if(decide.trim().equalsIgnoreCase("yes"))
			{
				outFile.print(input + "\n");
				outFile.close();
				error = false;
			}
			else if(decide.trim().equalsIgnoreCase("no"))
			{
				outFile.close();
				error = false;
			}	
			else
				System.out.println("Invalid input");
		}		
	}
	
	public void readData() throws FileNotFoundException
	{
		if(inFile.hasNext())
		{
			while(inFile.hasNext())
			{
				String storedData = inFile.next();
				output.printstockcalc(storedData);
			}
		}
		else
		{
			System.out.println("No saved data in watchlist.\n");
		}
		
	}
	
	public void removeData(String remove) throws FileNotFoundException
	{
		ArrayList<String> val = new ArrayList<String>();
		if(inFile.hasNext())
		{
			while(inFile.hasNext())
			{
				if(!inFile.next().equalsIgnoreCase(remove))
					val.add(inFile.next());
			}
			file.delete();
			for(String n : val)
			{
				outFile.print(n + "\n");
			}
			outFile.close();
		}
		else
		{
			System.out.println("Empty watchlist. Cannot remove.");
		}
	}
	
	public void chooseData(String choice) throws FileNotFoundException
	{		
		ArrayList<String> list = new ArrayList<String>();
		while(inFile.hasNext())
		{
			list.add(inFile.next());
		}
		
		if(choice.trim().equalsIgnoreCase("1"))
		{
			boolean invalid = true;
			while(invalid)
			{
				System.out.print("\nPlease enter a company to add to the watchlist: ");
				String comp = in.nextLine();
				
				stockcalc find = new stockcalc();
				find.search(choice);
				if(find.getXpath(0).equalsIgnoreCase("N/A"))
					System.out.print("Invalid company. Try again.");
				else
				{
					invalid = false;
					outFile.print(comp + "\n");
				}	
			}
			outFile.close();
		}
		else if(choice.trim().equalsIgnoreCase("2"))
		{
			boolean invalid = true;
			System.out.print("Which company should be removed?: ");
			while(inFile.hasNext())
			{
				System.out.print(inFile.next() + " ");
			}
			String comp = in.nextLine();
				
			boolean success = false;
			for(int n = 0; n < list.size(); n++)
			{
				if(comp.equalsIgnoreCase(list.get(n)));
				{
					removeData(comp);
					success = true;
				}
			}
			if(success == false)
			{
				System.out.println("Invalid term. Cannot remove.");
			}
		}
		else if(choice.trim().equalsIgnoreCase("3"))
		{
			for(String n : list)
			{
				System.out.print(n + " ");
			}
		}
	}
}
