//To Understand the run time polymorphism

package practise2;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver = null; // Initialize with null to point browser further.
		
		System.out.println("Enter the browser name GC/FF");
		
		Scanner s = new Scanner(System.in);
		
		String bN = s.nextLine();
		
		if (bN.equalsIgnoreCase("GC")) 
		{
			 driver = new ChromeDriver(); 			
		}
		else if(bN.equalsIgnoreCase("FF"))
		{
			 driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Enter Valid Browser Name");
		}
		
		driver.get("https://www.google.com");
		driver.close();
		
	}

}
