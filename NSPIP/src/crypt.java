import java.util.ArrayList;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class crypt {

	public static ArrayList<ArrayList> cryptocurrency() {
		String chromePath = "chromedriver79.exe";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("--silent");
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		System.setProperty("webdriver.chrome.silentOutput", "true"); //disable logging
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://markets.businessinsider.com/cryptocurrencies");
		ArrayList<String> currency = new ArrayList<String>();
		ArrayList<String> price = new ArrayList<String>();
		ArrayList<String> change = new ArrayList<String>();
		ArrayList<String> perchange = new ArrayList<String>();
		ArrayList<String> lastupdated = new ArrayList<String>();
		ArrayList<String> marketcap = new ArrayList<String>();
		ArrayList<String> circulatingsupply = new ArrayList<String>();
		ArrayList<String> vaolum = new ArrayList<String>();

		
		ArrayList<String> xpath = new ArrayList<String>();
		
		for(int i = 1; i<=20; i++) {
			String path = "	//div[4]/table/tbody/tr["+String.valueOf(i)+"]";
			xpath.add(path);
		}
		for(String e: xpath) {
			WebElement elem = driver.findElement(By.xpath(e));
			String text = elem.getAttribute("innerHTML");
			text = conver1(text);
			String[] info = spacesplit(text);
			
			
			currency.add(info[0]);
			price.add(info[1]);
			change.add(info[2]);
			perchange.add(info[3]);
			lastupdated.add(info[4]);
			marketcap.add(info[5]);
			circulatingsupply.add(info[6]);
			vaolum.add(info[7]);


		}

		ArrayList<ArrayList> total1 = new ArrayList<ArrayList>();
		total1.add(currency);
		total1.add(price);
		total1.add(change);
		total1.add(perchange);
		total1.add(lastupdated);
		total1.add(marketcap);
		total1.add(circulatingsupply);
		total1.add(vaolum);



		driver.close();
		
		return total1;
	
	}
	public static String conver1(String text) {
		String word = "";
		int skip1c = 0;
	
		
		for(int i = 0 ; i<text.length(); i++) {
			if (text.substring(i,i+1).equals("<")) {
				skip1c = skip1c + 1;
			}
			else if ((text.substring(i,i+1).equals(">")) && skip1c>0) {
				skip1c = skip1c - 1;
			}	
			else if (skip1c == 0)
				word = word + text.substring(i, i+1);
		}
		
		return word;
	}
	//splits text 
	public static String[] spacesplit(String text) {
		String[] splitednumandtext = text.split("									");
		return splitednumandtext;
	}
}
