package locators;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//Find the Xy position of the button
		WebElement getposition = driver.findElement(By.id("position"));
		Point xypoint = getposition.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println("The X Y position value is"+xvalue+"The Y position value is"+ yvalue);
		
		//Find the colour of the button.
		
		WebElement findclr = driver.findElement(By.id("color"));
		String color =  findclr.getCssValue("background-color");
		System.out.println("The button color is"+ color);
		
		//Find the size of the button.
		
		WebElement fndsize = driver.findElement(By.id("size"));
		int height = fndsize.getSize().getHeight();
		int width = fndsize.getSize().getWidth();
		System.out.println("The height of the button is"+height+ "The width of the button is"+width);
		
		// Click the button
		
		WebElement clickhome = driver.findElement(By.id("home"));
		clickhome.click();
		
		
		
		

	}

}

