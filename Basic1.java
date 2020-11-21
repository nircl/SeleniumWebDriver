//For Basic Understanding of Selenium code

package practise2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.google.com");
		
	}

}
