package PIIT.SeleniumS;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShoot {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// How to take Screen shoot
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("cookie-close")).click();
		screenShot("Cookies");//call the method
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,300)");
		
		Thread.sleep(2000);
		WebElement depart = driver.findElement(By.id("T7-departure_1"));
		depart.click();
		screenShot("Departure");//call the method
		
		WebElement depart_date = driver.findElement(By.xpath("(//*[text()='30'])[2]"));
		depart_date.click();
		screenShot("Departure Date");//call the method
	
		Thread.sleep(2000);
		driver.close();
	}
	
	//Several time taking screenshot better make a method, so wherever need to take picture we just call the method
	//Professional way go without parameter String pic
	public static void screenShot(String pic) throws IOException {
		/* All screenshot will be unique name by-
		-Capture the system date & time
		-Convert to string format
		-Use with picture name
		*/
		
		//Capture the system date & time
		Date date_time = new Date();
		System.out.println(date_time);
		
		//Capture date& time Convert to string format
		String convert_date_time = date_time.toString().replace(" ", "_").replace(":", "_");
		System.out.println(convert_date_time);
		
		//TakeScreenshot is interface and its take as a File format
		File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler should be org.openqa.selenium.io.FileHandler
		FileHandler.copy(shots, new File("C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\ScreenShot\\" + convert_date_time + ".png" + pic ));
	}

}
