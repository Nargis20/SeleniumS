package PIIT.SeleniumS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// How to select DropDown
		
		//1) Open the facebook page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Select the Drop down
		WebElement create_an_account = driver.findElement(By.linkText("Create New Account"));
		create_an_account.click();
		Thread.sleep(2000);
		
		//Month select
		WebElement birth_month = driver.findElement(By.id("month"));
		//constructor overloading 'Select(birth_month)'
		Select obj_month = new Select(birth_month);
		obj_month.selectByValue("6");
		Thread.sleep(2000);
		
		//Day Select
		WebElement birth_day = driver.findElement(By.name("birthday_day"));
		Select obj_day = new Select(birth_day);
		obj_day.selectByVisibleText("20");
		Thread.sleep(2000);
		
		//Year Select
		WebElement birth_year=driver.findElement(By.id("year"));
		Select obj_year = new Select(birth_year);
		obj_year.selectByValue("1988");
		Thread.sleep(2000);
		
		//Radio Button Female select
		driver.findElement(By.xpath("(//*[@class='_8esa'])[1]")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
