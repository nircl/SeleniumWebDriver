// To understand the *Web element interface*, used to perform actions on the element present in the webpage. 

package practise2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic5 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//										[OR]
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver(); 
//						[OR]
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		//1. to *clear* the text inside the search bar 
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant')]")).sendKeys("Chapathi - Palya");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant')]")).clear();
//		Thread.sleep(6000);
		
		//2. to *click* on link, radio button, check box, etc . . . .
//		driver.findElement(By.xpath("//a[text() = 'Login']")).click();
		
		//3. to *getAttribute* of a given tag 
		WebElement x = driver.findElement(By.xpath("(//span[text() = 'Bengaluru'])[2]"));
		System.out.println(x.getAttribute("class"));
		
		//4. to *getCssValue* of given tags (like font, size, color, etc. . . . ) 
		System.out.println(x.getCssValue("font"));
		System.out.println(x.getCssValue("font-size"));
		System.out.println(x.getCssValue("color"));
		
		//5. to *getLocation* i.e., to fetch x-y co-ord of web element (it returns point)
		Point loc = x.getLocation();
		System.out.println("X-axis : "+loc.getX()+" Y-axis : "+loc.getY());
		
		//6. to *getRect* to obtain x-y axis, width & height of an web element 
		Rectangle rec = x.getRect();
		System.out.println("X-axis : "+rec.getX()+" Y-axis : "+rec.getY()+" Width : "+rec.width+" Height : "+rec.height);
		
		//7. to *getSize* auto width & height of an web element (it returns dimensions)
		Dimension s = x.getSize();
		System.out.println("Dimension : "+s);
		
		//8. to *getTagName* of a given element 
		System.out.println(x.getTagName());
		
		//9. to *getText* of an web element 
		System.out.println(x.getText());
		
		//10. to verify whether web element is displayed? //11. enabled? //12. selected? 
		System.out.println("Displayed : "+x.isDisplayed());
		System.out.println("Enabled : "+x.isEnabled());
		System.out.println("Selected : "+x.isSelected());
		
		//13. to *sendKeys* that pass string and command to the web element 
//		WebElement sk = driver.switchTo().activeElement();
//		sk.sendKeys("Pizza");
//				[OR]
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant')]")).sendKeys("Chapathi - Palya");
		
		//14. to handle *submit* button in an web page (usually in the form)
				
		Thread.sleep(6000);
		driver.close();
	}

}
