/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Daniel Park, Harang Kim
 * @version 2/16/2020
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class watchlist{
	
		public static void main(String[] args) throws IOException {
			list();
		}
		public static ArrayList<String> list() throws IOException {
			ArrayList<String> companylist = new ArrayList<String>();
	        BufferedReader br = new BufferedReader(new FileReader("watchlist.txt"));
	        while(true) {
	            String line = br.readLine();
	            if (line==null) {
	            	break;
	            }
	            companylist.add(line);
	        }
	        br.close();
	        
	        return companylist;
		}
		
		public static void add(String comp) throws IOException {
			PrintWriter pw = new PrintWriter(new FileWriter("watchlist.txt",true));
			if(comp.trim().length() > 0)
			{
				pw.println(comp.trim());
				pw.close();
			}
		}	
		
		public static void delete(String del) throws IOException {
			ArrayList<String> companylist = new ArrayList<String>();
        	BufferedReader br = new BufferedReader(new FileReader("watchlist.txt"));
        	while(true) {
        		String line = br.readLine();
        		if (line==null) {
        			break;
        		}
        		companylist.add(line);
        	}
        	br.close();
			
        	File fil = new File("watchlist.txt");
        	fil.delete();
        	
			PrintWriter pw = new PrintWriter(new FileWriter("watchlist.txt",true));
			for(String n : companylist)
			{
				if(!n.equalsIgnoreCase(del))
					pw.println(n);
			}
			pw.close();
		}	
}
