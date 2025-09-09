package Generic_Utils;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass_ParallelSS {

	public WebDriver driver;
	
	@BeforeSuite
	public void bdconfig()
	{
		System.out.println(" connect to db ");
	}
	
	@BeforeClass
	public void launch_browser()
	{
		driver = new ChromeDriver();
		System.out.println("launch browser ");
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("-- login to appln --");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("-- logout from appln --");
	}
	
	@AfterClass
	public void close_browser()
	{
		driver.quit();
		System.out.println("-- close browser --");
	}
	
	@AfterSuite
	public void disconnect_db()
	{
		System.out.println("-- disconnect from db --");
	}
}
