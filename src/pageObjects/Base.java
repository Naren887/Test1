package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
// changing to git fdfdfd change from github

//changing from HP
public class Base {
	public static WebDriver driver;
	static WebElement element;
	static String SubElement;
    static String TestCaseName;
    static WebDriverWait Wait;
	static String UserName, Password;
	static String FirstName, LastName, StreetAddress1,StreetAddress2, City, State, Country, EmailAddress;
	static String Act_ProductName, Act_ProductPrice, Exp_ProductName, Exp_ProductPrice;

public Base (String TestCaseName) throws Exception {
	Base.TestCaseName= TestCaseName;
	
	}

public static WebElement mouseHoverAction (WebElement MainElement,  String SubElement)
{
	//MainElement = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
	Actions Act = new Actions (driver);
	Act.moveToElement(MainElement).build().perform();
	element = driver.findElement(By.linkText(SubElement));
	return element;
	
}


public static void WaitToBeClickable (WebElement element)
{
	Wait.until(ExpectedConditions.elementToBeClickable(element));
	
}




}
