package selAdvancedcncpts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement firstbutton = driver.findElement(By.id("home"));
		firstbutton.click();
		Set<String> handles =driver.getWindowHandles();
		
		for (String newWindow : handles) {
			
			driver.switchTo().window(newWindow);
			
			
			
		}
		
		WebElement Editbutton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
		Editbutton.click();
		
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement mulwndws = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		mulwndws.click();
		
		//To find number of windows opened
		
		int size = driver.getWindowHandles().size();
		System.out.println("Total number of windows"+size);
		
		//To close only child windows.
		
		WebElement allwindows = driver.findElement(By.id("color"));
		allwindows.click();
		Set<String> allhandles = driver.getWindowHandles();
		for (String hndlall : allhandles) {
			
			if(!hndlall.equals(oldwindow))
			{
				driver.switchTo().window(hndlall);
				driver.close();
			}
			//driver.quit();
			
		}
		

	}

}
