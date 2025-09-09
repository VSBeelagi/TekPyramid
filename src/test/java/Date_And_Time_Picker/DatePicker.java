package Date_And_Time_Picker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		
		driver.findElement(By.id("datetimepicker2")).click();
		WebElement dropEle=driver.findElement(By.xpath("//select[@class='flatpickr-monthDropdown-months']"));
		Select select=new Select(dropEle);
		select.selectByVisibleText("June");
		
		
		
	}

}
