package Date_And_Time_Picker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TimePicker_Default {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/timePick?sublist=0");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@aria-label='Choose time']")).click();
		
//		List<WebElement> hrs = driver.findElements(By.xpath("//div[@class='MuiMultiSectionDigitalClock-root css-16kz7cp']/ul[@aria-label='Select hours']/li"));
	
		WebElement hrs = driver.findElement(By.xpath("//ul[@aria-label='Select hours']"));
		WebElement h = driver.findElement(By.xpath("//ul[@aria-label='Select hours']/li[text()='08']"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(h).perform();
		h.click();
	
		WebElement min = driver.findElement(By.xpath("//ul[@aria-label='Select minutes']/li[text()='45']"));
		act.scrollToElement(min).perform();
		min.click();
		
		driver.findElement(By.xpath("//li[text()='PM']")).click();
	}
}
