/**
 * Program to retrieve stock data from google
 * Project Name: SPIP
 * 
 * @author Your Mom
 * @version 2/16/2020
 */


public class xpathsource
{
	public static String name = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/g-card-section[1]/div/g-card-section/div[1]/div/div[1]/span";
	public static String value = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/g-card-section[1]/div/g-card-section/span[1]/span/span[1]";
	public static String diff = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/g-card-section[1]/div/g-card-section/span[2]/span[1]";
	public static String per = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/g-card-section[1]/div/g-card-section/span[2]/span[2]/span[1]";
	public static String open = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/div/g-card-section[2]/div/div/div[1]/table/tbody/tr[1]/td[2]";
	public static String high = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/div/g-card-section[2]/div/div/div[1]/table/tbody/tr[1]/td[2]";
	public static String low = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/div/g-card-section[2]/div/div/div[1]/table/tbody/tr[1]/td[2]";
	public static String cap = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/div/g-card-section[2]/div/div/div[1]/table/tbody/tr[4]/td[2]";
	public static String ratio = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/div/g-card-section[2]/div/div/div[1]/table/tbody/tr[4]/td[2]";
	public static String yield = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/div/g-card-section[2]/div/div/div[2]/table/tbody/tr[1]/td[2]";
	public static String close = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/div/g-card-section[2]/div/div/div[2]/table/tbody/tr[2]/td[2]";
	public static String wkHigh = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/div/g-card-section[2]/div/div/div[2]/table/tbody/tr[3]/td[2]";
	public static String wkLow = "//*[@id=\"knowledge-finance-wholepage__entity-summary\"]/div/div/g-card-section[2]/div/div/div[2]/table/tbody/tr[4]/td[2]";
	
	public xpathsource()
	{
	}
}