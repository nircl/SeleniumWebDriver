// To understand the *locators* used to identify the web elements on the web page  

package practise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic4 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//											[OR]
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
//		WebDriver driver = new ChromeDriver();
//						[OR]
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.navigate().to("https://www.amazon.in"); 
//						[OR]
		driver.get("https://www.amazon.in");
		
		//1. find element by tagname
//		driver.findElement(By.tagName("input")).sendKeys("iphone 11");
		
		//2. find element by ID
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");
		
		//3. find element by name (here use attribute value of attribute name)
//		driver.findElement(By.name("field-keywords")).sendKeys("iphone 11");
		
		//4. find element by className
		driver.findElement(By.className("nav-input")).sendKeys("iphone XR");
		
		//5. find element by linkText (used only for anchor tags)
//		driver.findElement(By.linkText("Customer Service")).click();
		
		//6. find element by partial link text (used only for anchor tags)
//		driver.findElement(By.partialLinkText("Customer")).click();
		
		//7. find element by css Selector
//		driver.findElement(By.cssSelector("input[type = 'text']")).sendKeys("iphone se2");
		
		//8.1. find element by x-path : absolute x -path (from the root) (usually starts with '/')
//		driver.get("file:///C:/Users/nithe/Desktop/Selenium/First.html");
//		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Pass@123");
		
		//8.2. find element by x-path : relative x -path (anywhere in the web page) (usually starts with '//')
		//8.2.1. find element by x-path for attributes
//		driver.findElement(By.xpath("//img[@alt = 'CLOTHING UNDER ₹599']")).click();
		
		//8.2.2. find element by x-path for text
//		driver.findElement(By.xpath("//a[text() = 'Computers']")).click();
		
		//8.2.3. find element by x-path for handling partially dynamic elements
		//8.2.3.1. starts-with 
//		driver.findElement(By.xpath("//h2[starts-with(text(), 'Extra ₹300')]")).click();
		
		//8.2.3.2. ends-with (rarely works)
//		driver.findElement(By.xpath("//img[ends-with(@alt, 'TVs & appliances')]")).click();
		
		//8.2.3.3. contains
//		driver.findElement(By.xpath("//img[contains(@alt, 'TVs & appliances')]")).click();
		
		//8.2.4. find element by x-path using group index (when we have many similar elements)
//		driver.findElement(By.xpath("(//a[@tabindex = '0'])[10]")).click();
		
		//8.2.5. find element by x-path to handle complete dynamic elements (identifying dep. & indep. values)
//		driver.findElement(By.xpath("(//a[text() = 'See all deals'])[1]/../../../div/div[3]/a")).click(); //ex:1
		
		//8.2.6. find element by x-path using axes
//		driver.findElement(By.xpath("((//a[text() = 'See all deals'])[7])/parent::div[@class = 'a-cardui-footer']/ancestor::div[@id ='a-page']")).click(); //ex:1
//		driver.findElement(By.xpath("((//a[text() = 'See all deals'])[7])/parent::div[@class = 'a-cardui-footer']/parent::div[@data-a-card-type = 'basic']")); //ex:2
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
