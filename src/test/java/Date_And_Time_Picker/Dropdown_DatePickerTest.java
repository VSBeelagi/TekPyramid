package Date_And_Time_Picker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown_DatePickerTest {

	public static void main(String[] args) throws InterruptedException {

		String month = "Oct";
		int year = 2026;
		String monthAndYear = "October 2026";
		int date = 25;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/datePick/datedropdown?sublist=1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']/parent::div/following-sibling::*[name()='svg']")).click();
		
		//select month
		driver.findElement(By.xpath("//div[@class='react-datepicker__month-read-view']")).click();
		driver.findElement(By.xpath("//div[@class='react-datepicker__month-dropdown']/div[text()='"+month+"']")).click();
	
		//select year
		driver.findElement(By.xpath("//div[@class='react-datepicker__year-read-view']")).click();
		driver.findElement(By.xpath("//div[@class='react-datepicker__year-dropdown']/descendant::div[text()='"+year+"']")).click();
		Thread.sleep(2000);
		
		//select date
//		WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__month']/descendant::div[text()='25']"));
//		WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[@class='react-datepicker__week']/div[.='25']"));
		
		driver.findElement(By.xpath("//div[text()='"+monthAndYear+"']/parent::div/following-sibling::div/div/div[text()='"+date+"']")).click();
		
		System.out.println("-- done --");
	
	
	
	}

}
