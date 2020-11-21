// To understand *findElement/s* & *handling check boxes and handling radio buttons* 

package practise2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic6 
{
	static
	{
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//											[OR]
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
//		WebDriver driver = new ChromeDriver(); 
//						[OR]
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/nithe/Desktop/Selenium/findElements.html");
		
		//1. Check box - check - un check - top - bottom & vice versa----------------------------
		
//		List<WebElement> cb = driver.findElements(By.xpath("//input[@type = 'checkbox']"));		
		
//		int a1 = cb.size();
//		for (int i = 0; i < a1; i++) //top - bottom checking 
//		{
//			cb.get(i).click();				
//		}
////						[OR]
//		for (int i = a1 - 1; i >= 0; i--) //bottom - top un checking 
//		{
//			cb.get(i).click();				
//		}
////				[OR]
////		for(WebElement we:cb)
////		{
////			we.click();
////		}
		
		//2. Check box - check - un check - top - bottom & vice versa (odd n even manner)----------------------------
//		int a1 = cb.size();
//		for (int i = 0; i < a1; i++) //top - bottom checking 
//		{
//			if (i%2 == 0) 
//			{
//				cb.get(i).click();				
//			}
//							
//		}
////						[OR]
//		for (int i = a1 - 1; i >= 0; i--) //bottom - top un checking 
//		{
//			if (i%2 == 0) 
//			{
//				cb.get(i).click();		
//			}
//		}

		//1. RadioButton - check - un check - top - bottom & viceversa----------------------------
//		List<WebElement> rb = driver.findElements(By.xpath("//input[@type = 'radio']"));
//		
//		int a2 = rb.size();
//		for (int i = 0; i < a2; i++) //top - bottom checking 
//		{
//			rb.get(i).click();				
//		}
////						[OR]
//		for (int i = a2 - 1; i >= 0; i--) //bottom - top un checking 
//		{
//			rb.get(i).click();				
//		}
//				[OR]
//		for(WebElement we:rb)
//		{
//			we.click();
//		}
		
		//2. Radio button - check - un check - top - bottom & vice versa (odd n even manner)----------------------------
//		int a2 = rb.size();
//		for (int i = 0; i < a2; i++) //top - bottom checking 
//		{
//			if (i%2 != 0) 
//			{
//				rb.get(i).click();				
//			}
//							
//		}
////						[OR]
//		for (int i = a2 - 1; i >= 0; i--) //bottom - top un checking 
//		{
//			if (i%2 != 0) 
//			{
//				rb.get(i).click();		
//			}
//		}
		
		
		
		
				
		Thread.sleep(2000);
		driver.close();
		
		
	}

	

}
