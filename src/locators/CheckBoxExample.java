package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		WebElement java = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
		java.click();
		
		WebElement selenium = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		System.out.println(selenium.isSelected());
		
		WebElement test = driver.findElement(By.xpath("//div[text()='Not Selected']/input"));
		test.click();
		
		

	}

}
