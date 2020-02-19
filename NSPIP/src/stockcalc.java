/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Your Mom
 * @version 2/16/2020
 */

import java.util.ArrayList;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class stockcalc
{
	public static WebDriver driver;
	public static final String chromePath = "chromedriver79.exe";
	
	public stockcalc()
	{	
		//chromedriver variable
		String chromePath = "chromedriver79.exe";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("--silent");
		System.setProperty("webdriver.chrome.driver", chromePath);	
		System.setProperty("webdriver.chrome.silentOutput", "true"); //disable logging
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
				
		driver = new ChromeDriver(options);
	}
	
	/**
	 * Method to search google for keyword
	 * @param input of user for company
	 * @param driver for chromedriver
	 */
	public void search(String input)
	{
		driver.get("http://google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(input + " stocks");
		search.sendKeys(Keys.RETURN);	
	}
	
	/**
	 * Getter method to return value of xpath
	 * @param path of xpath data
	 * @param driver chromedriver
	 * @return xpath text values found
	 */
	public String getXpath(int n)
	{
		ArrayList<String> paths = new ArrayList<String>();
		paths.add(xpathsource.name);
		paths.add(xpathsource.value);
		paths.add(xpathsource.diff);
		paths.add(xpathsource.per);
		paths.add(xpathsource.open);
		paths.add(xpathsource.high);
		paths.add(xpathsource.low);
		paths.add(xpathsource.cap);
		paths.add(xpathsource.ratio);
		paths.add(xpathsource.yield);
		paths.add(xpathsource.close);
		paths.add(xpathsource.wkHigh);
		paths.add(xpathsource.wkLow);

		boolean exists = driver.findElements(By.xpath(paths.get(n))).size() > 0;
		if(exists)
		{
			WebElement data = driver.findElement(By.xpath(paths.get(n)));
			return data.getText();
		}
		else
		{
			return ("N/A");	
		}
	}
	
	public void close()
	{
		driver.close();
	}
}