package PIIT.SeleniumS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointer {

	public static void main(String[] args) throws InterruptedException {
		//Action Class

		//1) Open the Amazon page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//when create constructor should mention driver
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//*[text()='Hello, Sign in'])[1]"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"))).click().build().perform();
		Thread.sleep(2000);
		
		//Same window open another Child window
		String click_link = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.id("createAccountSubmit")).sendKeys(click_link);
		
		/*
		//Open different new window  
		//act.keyDown(driver.findElement(By.id("createAccountSubmit")),Keys.LEFT_SHIFT).click().build().perform();
		act.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.SHIFT).click().build().perform();
		
		//key release
		act.keyUp(Keys.SHIFT).build().perform();
		*/
		Thread.sleep(2000);
		
		//driver.close();
	}

}
