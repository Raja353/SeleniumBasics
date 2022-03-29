package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.leafground.com/pages/Edit.html");
	    
	    WebElement enteremail=driver.findElement(By.id("email"));
	    enteremail.sendKeys("drajasekarmca@gmail.com");
	    
	    WebElement Appendtext=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
	    Appendtext.sendKeys("text");
	    
	    WebElement gettext = driver.findElement(By.name("username"));
	    String value = gettext.getAttribute("value");
	    System.out.println(value);
	    
	    WebElement cleartxt = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
	    cleartxt.clear();
	    
	    WebElement isdsbled = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
	    String val = isdsbled.getAttribute("disabled");
	    
	    System.out.println(isdsbled.isEnabled());
	    
	    System.out.println(val);
	    
	    
	    }
}


