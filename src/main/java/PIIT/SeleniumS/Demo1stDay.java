package PIIT.SeleniumS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1stDay {

	public static void main(String[] args) {
		//How to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		driver.close();
	}

}
