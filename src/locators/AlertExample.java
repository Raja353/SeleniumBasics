package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.leafground.com/pages/Alert.html");
    //alert box
    WebElement alertbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
    alertbox.click();
    Thread.sleep(1000);
    Alert alert = driver.switchTo().alert();
    Thread.sleep(1000);
    alert.accept();
    
    //Confirm Box
    
    WebElement confrmbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
    confrmbox.click();
    Thread.sleep(1000);
    Alert cnfrmalrt = driver.switchTo().alert();
    Thread.sleep(1000);
    cnfrmalrt.dismiss();
    
    // Prompt Box
    
    WebElement prmptbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
    prmptbox.click();
    Thread.sleep(1000);
    Alert prmpalrt = driver.switchTo().alert();
    prmpalrt.sendKeys("Raja");
    Thread.sleep(1000);
    prmpalrt.accept();
    
    
	}

}
