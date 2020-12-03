package PIIT.SeleniumS;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// Window Handle- When ever the browser is opening there is unique id associated with that browser session that id in selenium is known as window handle.
		
		//1) Open the Amazon page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//when create constructor of Actions Class should mention driver
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//*[text()='Hello, Sign in'])[1]"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"))).click().build().perform();
		Thread.sleep(2000);
		
		
		//Same window open another Child window
		String click_link = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.id("createAccountSubmit")).sendKeys(click_link);
		

		String parent_window_handle = driver.getWindowHandle();
/*		System.out.println("Parent window ID : "+ parent_window_handle);
		
		//Open different new window  
		act.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.SHIFT).click().build().perform();
		
		//key release
		act.keyUp(Keys.SHIFT).build().perform();
*/		Thread.sleep(2000);
		

		//Set from collection framework and only store unique value
		Set<String> all_window_handle= driver.getWindowHandles();
		
		//take the window handle in different window
		for(String Window : all_window_handle) {
				
		if(Window.equalsIgnoreCase(parent_window_handle)) {
			System.out.println("This is Parent");
		} else {
			driver.switchTo().window(Window);
			System.out.println("This is Child");
			}
		}
		
		//Child window your name 
		WebElement your_name = driver.findElement(By.id("ap_customer_name"));
		your_name.sendKeys("lisu");
		Thread.sleep(2000);
		
		//parent window email
		driver.switchTo().window(parent_window_handle);
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("lisu31@yahoo.com");
		
		//driver.quit();
	}

}
