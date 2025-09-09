package Generic_Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass_incognito{
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		driver = new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-private");
			
			driver =new FirefoxDriver(options);
		}
		
		else
		{
			System.out.println(" invalid browser ");
		}
		driver.get("https://www.flipkart.com");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
