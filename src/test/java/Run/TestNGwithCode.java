package Run;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import CodeForBrowser.OpenBrowsers;
import Pages.facebook.Forgot_Password1;
import Pages.facebook.Home;
//import org.testng.Assert;


public class TestNGwithCode extends OpenBrowsers {
	
  @Test(priority = 1)
  public void FacebookHome() throws InterruptedException {
	 //Open the facebook site and verify the login function
	  //call Home class as page factory model
	  Home obj = new Home(driver);
	  obj.emailofinput("taarazsena20@yahoo.com");
	  obj.passwrdofinput("taaraz20");
	  obj.signingin();
	  
	  //we failed intentionally to show the dependency, by this next method will be skipped, will not run
	  //driver.findElement(By.linkText("i")).click();
  }
  
  @Test(priority = 2, dependsOnMethods = "FacebookHome")
  public void ForgotlinkPage() throws InterruptedException {
	  Home obj = new Home(driver);
	  obj.Forgot();
	  Forgot_Password1 forgot_obj = new Forgot_Password1(driver);
	  
	  //Assert -> verify the text -> hard Assertion - Assert class
	  //Soft Assertion-> verification fail but run the script and show in log
	  String forgot_msg = forgot_obj.ForgotYourAccountText().getText();
	  System.out.println(forgot_msg);
	  //hard assert
	  //Assert.assertEquals(forgot_msg, "Find Your Account");
	  
	  //Soft Assertion-> need to create object of softassert class
	  SoftAssert sa = new SoftAssert();
	  //sa.assertEquals( String actual, String expected);
	  sa.assertEquals(forgot_msg, "Find Your Account");
	  
	  forgot_obj.find_an_account("taarazsena20@gmail.com");
	  forgot_obj.search_button();
	  
	  //soft Assert use assertAll(); otherwise the script show pass not showing fail
	  sa.assertAll();
  }
 
/*
  public void Driver(String browser, String URI)
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
	} */
}
