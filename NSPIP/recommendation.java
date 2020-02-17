import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class recommendation {


	public static ArrayList<ArrayList> mostactives(){
		
		//chromedriver variable
		String chromePath = "chromedriver79.exe";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("--silent");
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		System.setProperty("webdriver.chrome.silentOutput", "true"); //disable logging
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver = new ChromeDriver(options);
		

		
		driver.get("https://money.cnn.com/data/hotstocks/");
		ArrayList<String> company = new ArrayList<String>();
		ArrayList<String> price = new ArrayList<String>();
		ArrayList<String> change = new ArrayList<String>();
		ArrayList<String> perchange = new ArrayList<String>();
		
	ArrayList<ArrayList> total = new ArrayList<ArrayList>();
		total.add(company);
		
		ArrayList<String> xpath = new ArrayList<String>();
		
		for(int i = 2; i<=11; i++) {
			String path = "//*[@id=\"wsod_hotStocks\"]/table[1]/tbody/tr["+String.valueOf(i)+"]";
			xpath.add(path);
		}

		for(String e: xpath) {
			WebElement elem = driver.findElement(By.xpath(e));
			String text = elem.getAttribute("innerText");
			String[] info = spacesplit(text);
			company.add(info[0]);
			price.add(info[1]);
			change.add(info[2]);
			perchange.add(info[3]);
		}
		
	
		ArrayList<ArrayList> total1 = new ArrayList<ArrayList>();
		total1.add(company);
		total1.add(price);
		total1.add(change);
		total1.add(perchange);

		
		driver.close();

		
		return total1;


		
	}
	

	public static ArrayList<ArrayList> gainers(){
		
		//chromedriver variable
		String chromePath = "chromedriver79.exe";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://money.cnn.com/data/hotstocks/");
		ArrayList<String> company = new ArrayList<String>();
		ArrayList<String> price = new ArrayList<String>();
		ArrayList<String> change = new ArrayList<String>();
		ArrayList<String> perchange = new ArrayList<String>();
		
	ArrayList<ArrayList> total = new ArrayList<ArrayList>();
		total.add(company);
		
		ArrayList<String> xpath = new ArrayList<String>();
		
		for(int i = 2; i<=11; i++) {
			String path = "//*[@id=\"wsod_hotStocks\"]/table[2]/tbody/tr["+String.valueOf(i)+"]";
			xpath.add(path);
		}

		for(String e: xpath) {
			WebElement elem = driver.findElement(By.xpath(e));
			String text = elem.getAttribute("innerText");
			String[] info = spacesplit(text);
			company.add(info[0]);
			price.add(info[1]);
			change.add(info[2]);
			perchange.add(info[3]);
		}
		
	
		ArrayList<ArrayList> total1 = new ArrayList<ArrayList>();
		total1.add(company);
		total1.add(price);
		total1.add(change);
		total1.add(perchange);
		
		driver.close();

		return total1;


		
	}
	public static ArrayList<ArrayList> losers(){
		
		//chromedriver variable
		String chromePath = "chromedriver79.exe";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://money.cnn.com/data/hotstocks/");
		ArrayList<String> company = new ArrayList<String>();
		ArrayList<String> price = new ArrayList<String>();
		ArrayList<String> change = new ArrayList<String>();
		ArrayList<String> perchange = new ArrayList<String>();
		
	ArrayList<ArrayList> total = new ArrayList<ArrayList>();
		total.add(company);
		
		ArrayList<String> xpath = new ArrayList<String>();
		
		for(int i = 2; i<=11; i++) {
			String path = "//*[@id=\"wsod_hotStocks\"]/table[3]/tbody/tr["+String.valueOf(i)+"]";
			xpath.add(path);
		}

		for(String e: xpath) {
			WebElement elem = driver.findElement(By.xpath(e));
			String text = elem.getAttribute("innerText");
			String[] info = spacesplit(text);
			company.add(info[0]);
			price.add(info[1]);
			change.add(info[2]);
			perchange.add(info[3]);
		}
		
	
		ArrayList<ArrayList> total1 = new ArrayList<ArrayList>();
		total1.add(company);
		total1.add(price);
		total1.add(change);
		total1.add(perchange);
		
		driver.close();
		return total1;
		

		
	}
	//splits text 
	public static String[] spacesplit(String text) {
		String[] splitednumandtext = text.split("	");
		return splitednumandtext;
	}
}
