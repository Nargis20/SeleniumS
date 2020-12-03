package PIIT.SeleniumS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// Alert Handling
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(1000);
		
		//Accept the Alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Cancel the Alert
		driver.switchTo().alert().dismiss();
		*/
		
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//close the cookie
		driver.findElement(By.id("cookie-close")).click();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,300)");
		
		Thread.sleep(2000);
		WebElement depart = driver.findElement(By.id("T7-departure_1"));
		depart.click();
		
		WebElement depart_date = driver.findElement(By.xpath("(//*[text()='30'])[2]"));
		depart_date.click();
	}

}
