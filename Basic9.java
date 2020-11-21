//AS to handle drop down list by using select class

package practise2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic9 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/nithe/Desktop/Selenium/DropDownList.html");
		System.out.println("___________________________________________________________________");
		
		//Single select drop down list 		
		WebElement ssddl = driver.findElement(By.id("s1"));
		Select s1 = new Select(ssddl);
		s1.selectByIndex(2);
		s1.selectByValue("v5");
		s1.selectByVisibleText("Karnataka");
//		System.out.println("Is this Multi Select dropdown?"+s1.isMultiple());
//							[OR]
		if(s1.isMultiple() == false)
		{
			System.out.println("This is Single select Dropdownlist");
		}
		else
		{
			System.out.println("This is Multi select Dropdownlist");
		}
		System.out.println("___________________________________________________________________");
		
		//Multiple select drop down list 
		WebElement msddl = driver.findElement(By.id("s2"));
		Select s2 = new Select(msddl);
		s2.selectByIndex(2);
		s2.selectByValue("a5");
		s2.selectByVisibleText("Idly Vada");
//		System.out.println("Is this Multi Select dropdown?"+s2.isMultiple());
//							[OR	``]
		if(s2.isMultiple() == false)
		{
			System.out.println("This is Single select Dropdownlist");
		}
		else
		{
			System.out.println("This is Multi select Dropdownlist");
		}
		System.out.println("___________________________________________________________________");
		
		//De select drop down list 
//		s2.deselectByIndex(2);
//		s2.deselectByValue("a5");
//		s2.deselectByVisibleText("Idly Vada");
//		s2.deselectAll(); 
		
		//get all selected options
//		List<WebElement> allsopt = s1.getAllSelectedOptions();
		List<WebElement> allsopt = s2.getAllSelectedOptions();
		System.out.println("All Selected options are : ");
		for (WebElement we:allsopt) 
		{
			System.out.println(we.getText());			
		}
		System.out.println("___________________________________________________________________");
		
		//get first selected option (only in multi select dropdown condition)
		System.out.println("First Selected option is : ");
//		System.out.println(s1.getFirstSelectedOption().getText());
		System.out.println(s2.getFirstSelectedOption().getText());
		System.out.println("___________________________________________________________________");
		
		//get all the options inside drop down 
		System.out.println("All the options inside drop down list is : ");
		List<WebElement> allopt = s1.getOptions();
//		List<WebElement> allopt = s2.getOptions();
		for(WebElement we:allopt) 
		{
			System.out.println(we.getText());
		}
		System.out.println("___________________________________________________________________");
		
		//get all the wrapped options inside drop down
		System.out.println("Wrapped Elements inside a drop down list is : ");
		WebElement var = s1.getWrappedElement();
//		WebElement var = s2.getWrappedElement();
		System.out.println(var.getText());	
		System.out.println("___________________________________________________________________");
		
		Thread.sleep(3000);
		driver.close();
	}

}
