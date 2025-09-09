package Date_And_Time_Picker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		
		String monthAndYear = "October 2025";
		int date = 25;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Default Date picker ( Normal )']/parent::article/descendant::*[name()='svg']")).click();
	
		String futureDate = "//div[text()='"+monthAndYear+"']/ancestor::div[@class='react-datepicker__month-container']/descendant::div[text()='"+date+"']";
		String nextMonth = "//button[@aria-label='Next Month']";
		
		for(;;)
		{
			try {
				driver.findElement(By.xpath(futureDate)).click();
				break;
			}
			catch (Exception e) {
				driver.findElement(By.xpath(nextMonth)).click();
			}
		}
		
	}
}
