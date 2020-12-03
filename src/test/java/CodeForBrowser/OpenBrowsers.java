package CodeForBrowser;

//import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class OpenBrowsers {
	public WebDriver driver;
  @Parameters({"browser", "URI"})

  @BeforeClass
  public void beforeClass(String browser, String site) {
	  if(browser.equalsIgnoreCase("Chrome")){
			//if we want to run same code without changing path in other machine
			String director = System.getProperty("user.dir");
			System.out.println(director);
			System.setProperty("webdriver.chrome.driver", director +"\\Drivers\\chromedriver.exe");
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
}
