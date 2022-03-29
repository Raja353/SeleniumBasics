package locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement drp1 = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(drp1);
		select.selectByIndex(4);
		Thread.sleep(4000);
		select.selectByValue("2");
		Thread.sleep(4000);
		select.selectByVisibleText("Selenium");
		
	
		List<WebElement> listofopt = new ArrayList<>();
		listofopt =	select.getOptions();
		int size = listofopt.size();
		System.out.println("Number of Elements"+ size);
		
		WebElement multislctt= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		//Select slctsele = new Select(multislct);
		
		Select slct = new Select(multislctt);
		
		
		slct.selectByIndex(1);
		slct.selectByIndex(2);
		slct.selectByIndex(3);
		
		WebElement drp3 = driver.findElement(By.id("dropdown3"));
		drp3.sendKeys("Appium");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
