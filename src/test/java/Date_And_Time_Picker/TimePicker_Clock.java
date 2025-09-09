package Date_And_Time_Picker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverListener;

public class TimePicker_Clock implements WebDriverListener{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/timePick/timeClock?sublist=1");
		
		driver.findElement(By.xpath("//input[@inputmode='text']")).click();
		
//		driver.findElement(By.xpath("//div[@class='MuiTimePickerToolbar-hourMinuteLabel css-1l4fxj8']/button[1]")).click();
		Thread.sleep(2000);
		
		WebElement hr = driver.findElement(By.xpath("//div[@class='MuiClock-squareMask css-1umqo6f']/../div[@class='MuiClock-wrapper css-1nob2mz']/span[text()='4']"));
//		WebElement h = driver.findElement(By.xpath("//span[text()='4']"));
		
		Actions act = new Actions(driver);
		act.click(hr).perform();
		
		WebElement min = driver.findElement(By.xpath("//span[text()='30']"));
		act.click(min).perform();
		
		driver.findElement(By.xpath("//span[text()='AM']")).click();
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
}
