package PIIT.SeleniumS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2ndDay {

	public static void main(String[] args) throws InterruptedException {
		/* 
		 * 1) Open the facebook page
		 * 2)Enter the email and password
		 * 3) Click login
		 * 4) Click forgot password
		 * 5) come back to login page
		 * 6) Click to create an account
		 */
		
		//1) Open the facebook page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//2)Enter the email and password
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("taaraz@yahoo.com");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("borkat");
		Thread.sleep(2000);
		
		//3) Click login
		WebElement login = driver.findElement(By.xpath("//*[@data-testid='royal_login_button']"));
		login.click();
		Thread.sleep(6000);
		
		//4) Click forgot password
		WebElement forgot =driver.findElement(By.linkText("Forgot Password?"));
		forgot.click();
		Thread.sleep(4000);
		
		//5) come back to login page
		driver.navigate().back();
		Thread.sleep(2000);
		
		// 6) Click to create an account
		WebElement create_new_account = driver.findElement(By.xpath("(//*[@role='button'])[1]"));
		create_new_account.click();
		Thread.sleep(2000);
		
		//7. close the browser
		driver.close();
	}

}
