package Run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import CodeForBrowser.OpenBrowsers;
import Pages.facebook.Home;

public class Shots extends OpenBrowsers{
	//ONLY CREATE FOR SHOW PASS AND FAILED SCREENSHOTS
  @Test
  public void s_shots() throws InterruptedException, IOException {
	  //input data from properties file
	  Properties pro = new Properties();
	  FileInputStream fis = new FileInputStream("C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Config.properties");
	  pro.load(fis);
	  String email= pro.getProperty("email");
	  String pass= pro.getProperty("password");
	  
	  
	  Home obj = new Home(driver);
	  obj.emailofinput(email);
	  obj.passwrdofinput(pass);
	  obj.signingin();
  }
  @Test
  public void s_shots1() throws InterruptedException {
	  Home obj = new Home(driver);
	  obj.emailofinput("lovs@yahoo.com");
	  obj.passwrdofinput("loving20");
	  obj.signingin();
  }
  
  //failed method
  @Test
  public void s_shots2() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.id("jsh")).click();
	  
  }
  @Test
  public void s_shots3() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("jsh")).click();
  }
}
