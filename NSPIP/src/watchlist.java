/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Your Mom
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
			pw.println(comp);
			pw.close();
		}


		
		
}
//		}
//		public static void add() {
//	        PrintWriter pw = new PrintWriter("watchlist.txt");
//
//		}
//	    public static void ma{in(String[] args) throws IOException {
//	        PrintWriter pw = new PrintWriter("watchlist.txt");
//	        for(int i=1; i<11; i++) {
//	            pw.println(data);
//	        }
//	        pw.close();
//
//
//	        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
//	        for(int i=11; i<21; i++) {
//	            pw2.println(data);
//	        }
//	        pw2.close();
	    
	
