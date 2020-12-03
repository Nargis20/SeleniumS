package PIIT.SeleniumS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2ndDay {

	public static void main(String[] args) {
		/*Locators
		 * ID (amazon)
		 * LinkText
		 * PartialLinkText
		 * Xpath
		 * Name (facebook)
		 * Tagname
		 * CSS Selector
		 * Classname
		 */
		//How to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("Phones");
		
		WebElement SButton = driver.findElement(By.id("nav-search-submit-text"));
		SButton.click();
		
		/* Absolute Path and Relative Xpath
		 * 1) Open the facebook page
		 * 2)Enter the email and password
		 * 3) Click login
		 * 4) Click forgot password
		 * 5) come back to login page
		 * 6) Clcik to create an account
		 */
	}

}
