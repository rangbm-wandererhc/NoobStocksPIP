
import java.util.ArrayList;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class recommendation {

	public static void main(String[] args) {
		
		//most actives
		System.out.println("Most actives");
		ArrayList<ArrayList> mostactives = new ArrayList<ArrayList>();
		ArrayList<String> activecompany = new ArrayList<String>();
		ArrayList<String> activeprice = new ArrayList<String>();
		ArrayList<String> activechange = new ArrayList<String>();
		ArrayList<String> activeperchange = new ArrayList<String>();
		mostactives = mostactives();
		activecompany = mostactives.get(0);		
		activeprice = mostactives.get(1);		
		activechange = mostactives.get(2);		
		activeperchange = mostactives.get(3);	
		
		for(int i = 0 ; i<activecompany.size(); i++) {
			System.out.printf("%s \t",activecompany.get(i));
			System.out.printf("%s \t",activeprice.get(i));
			System.out.printf("%s \t",activechange.get(i));
			System.out.printf("%s \t",activeperchange.get(i));
			System.out.println();
		}
		
		//top gainers
		System.out.println("Top Gainers");
		ArrayList<ArrayList> gainers = new ArrayList<ArrayList>();
		ArrayList<String> gaincompany = new ArrayList<String>();
		ArrayList<String> gainprice = new ArrayList<String>();
		ArrayList<String> gainchange = new ArrayList<String>();
		ArrayList<String> gainperchange = new ArrayList<String>();
		gainers = gainers();
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
		losers = losers();
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
	public static ArrayList<ArrayList> mostactives(){
		
		//chromedriver variable
		String chromePath = "chromedriver79.exe";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver", chromePath);
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
		
		System.setProperty("webdriver.chrome.driver", chromePath);
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
		
		System.setProperty("webdriver.chrome.driver", chromePath);
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
