//AS to take a screenshot of a particular web page 

package practise2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic8 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pexels.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;  
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snapshots/px.png");
		FileUtils.copyFile(src, dest);			
	}
}
