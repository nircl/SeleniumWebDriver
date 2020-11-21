// As for handling scroll bar (i.e., random and particular element scroll bar)

package practise2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic7 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//										[OR]
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
//						[OR]
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com");
		
//		---------------------- Random Scroll -----------------------
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
//		js.executeScript("scrollBy(0, 2000)");

//		js.executeAsyncScript("scrollBy(0, 6000)");
		
//		---------------------- Particular Element targeted Scroll -----------------------
		
		WebElement blog = driver.findElement(By.xpath("//span[text() = 'BLOG']"));
		
		Point loc = blog.getLocation();
		 
		int x = loc.getX();
		int y = loc.getY();
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		js.executeScript("scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		driver.close();	
		
	}

}
