package PIIT.SeleniumS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrower {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Any button displayed or not
		
		Driver("Chrome", "https://www.facebook.com");
		
		//Check Create new Account button displable or not
		WebElement create_new_account = driver.findElement(By.linkText("Create New Account"));
		boolean button = create_new_account.isDisplayed();
		System.out.println("Create New Account Displayed : " + button);
		Thread.sleep(2000);
				
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
		String msg = text.getText();
		System.out.println(msg);
		Thread.sleep(8000);
		driver.close();
	}
	
	public static void Driver(String browser, String URI)
	{
	if(browser.equalsIgnoreCase("Chrome")){
		//if we want to run same code without changing path in other machine
		String director = System.getProperty("user.dir");
		System.out.println(director);
		System.setProperty("webdriver.chrome.driver", director +"\\Drivers\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URI);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}else if(browser.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(URI);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

}
