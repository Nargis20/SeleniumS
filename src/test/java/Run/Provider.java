package Run;

import org.testng.annotations.Test;

import CodeForBrowser.OpenBrowsers;
import Pages.facebook.Home;

import org.testng.annotations.DataProvider;

public class Provider extends OpenBrowsers{
  @Test(dataProvider = "dp")
  public void f(String email, String password) throws InterruptedException {
	  Home obj = new Home(driver);
	  obj.emailofinput(email);
	  obj.passwrdofinput(password);
	  obj.signingin();	
  }
  
//Data provider also parameterization, xml file also we can pass parameter, another way by properties 
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "wnnargis99@yahoo.com", "alborkat3" },
      new Object[] { "wnnargis8@yahoo.com", "alborkat" },
      new Object[] { "wnnargis8@yahoo.com", "alborkat3" },
    };
  }
}
/*
 * Enter valid username and invalid password
 * Enter invalid username and valid password
 * Enter invalid username and invalid password
 */
