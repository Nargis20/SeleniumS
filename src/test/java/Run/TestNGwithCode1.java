package Run;

import org.testng.annotations.Test;
import CodeForBrowser.OpenBrowsers;
import Pages.facebook.Home;

public class TestNGwithCode1 extends OpenBrowsers{

  @Test
  public void HomePage() throws InterruptedException {
	  //2nd set of entry
	  Home obj = new Home(driver);
	  obj.emailofinput("wnnargis8@yahoo.com");
	  obj.passwrdofinput("alborkat3");
	  obj.signingin();	
  }
}
