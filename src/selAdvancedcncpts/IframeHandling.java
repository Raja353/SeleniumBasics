package selAdvancedcncpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeHandling {

	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement infrme = driver.findElement(By.id("Click"));
		infrme.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		}
	    
}
