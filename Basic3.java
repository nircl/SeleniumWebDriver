// To understand methods of *web driver*

package practise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
//		driver.navigate().to("https://www.hdfc.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
//		driver.close();
//		driver.quit();
		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
//		System.out.println(driver.getTitle());
//		
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		
//		Thread.sleep(2000);
		
//		driver.findElement(By.name("q")).sendKeys("Nitesh Rc Lingaiah");
//		driver.switchTo().activeElement().sendKeys("Nitesh Rc Lingaiah");
		
		
		
	}
}
	
