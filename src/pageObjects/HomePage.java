package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Base {
	public HomePage() throws Exception 
	{
		super (TestCaseName);
	}
	
	
	public static WebElement element;
	static WebDriver driver = new FirefoxDriver();
	
	
	public static class Header 
	{
		
	public static WebElement Imagelogo()
	{
		element = driver.findElement(By.xpath(".//a[@id='logo']/img"));
		return element;
	}
	
	public static WebElement btn_ShoppingCart()
	{
		element = driver.findElement(By.xpath(".//div[@id='header_cart']/a/span[1]"));
		return element;
	}
	
	public static String ItemsInTheShoppingCart()
	{
		element = driver.findElement(By.xpath(".//*[@id='header_cart']/a/em[1]"));
		return element.getText();
	}	
	
	public static WebElement btn_FullShoppingCart()
	{
		element = driver.findElement(By.xpath("//div[@id='header_cart']/a"));
		return element;
	}	
	
	public static WebElement btn_myAccount()
	{
		element = driver.findElement(By.xpath(".//div[@id='account']/a/span[1]"));
		return element;
	}	
	
	public static WebElement btn_FullmyAccount()
	{
		element = driver.findElement(By.xpath(".//div[@id='account']/a"));
		return element;
	}	
	
	}
	
	public static class TopNavigation 
	{
		public static WebElement btn_Home ()
		{element = driver.findElement(By.xpath(".//li[@id='menu-item-15']/a"));
		return element;
		}
		
		public static WebElement Accessories()
		{
			WebElement MainElement = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
			element = mouseHoverAction(MainElement,"Accessories");
			return element;
		}
		
		public static WebElement iMacs()
		{
			WebElement MainElement = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
			element = mouseHoverAction(MainElement,"iMacs");
			return element;
		}
		
		public static WebElement iPads()
		{
			WebElement MainElement = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
			element = mouseHoverAction(MainElement, "iPads");
			return element;
		}
		
		public static WebElement iPhones()
		{
			WebElement MainElement = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
			element = mouseHoverAction(MainElement, "iPhones");
			return element;
		}
		public static WebElement iPods()
		
		{
			WebElement MainElement = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
			element = mouseHoverAction(MainElement, "iPods");
			return element;
		}
		public static WebElement MacBooks()
		{
			WebElement MainElement = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
			element = mouseHoverAction(MainElement, "MacBooks");
			return element;
		}
		
		public static WebElement All_Products()
		{
			element = driver.findElement(By.xpath(".//li[@id='menu-item-72']/a"));
			return element;
		}
		public static WebElement Search ()
		{
			element = driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"));
			return element;
		}
		
		
		public static class Body
		{
			public static WebElement imgiPhone5 () {
			WaitToBeClickable(driver.findElement(By.xpath("div//*[@id='slides']/div[1]/div[2]/a/img")));	
			element = driver.findElement(By.xpath(".//div[@id='slides']/div[1]/div[2]/a/img"));
			return element;
			
			}
			
			
			
			
			
			
		}
		
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

