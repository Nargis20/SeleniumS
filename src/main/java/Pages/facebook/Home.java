package Pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	/*Page Factor Model
	 * 1) Store locators for the elements
	 * 2) Create Page Factory Constructor
	 * 3} Creation of Methods for each element according to the Actions
	 */
	
	//Step 2 first step
	public WebDriver driver;
	
	//Step-1 - locate the element same as it findelement 
	@FindBy(name = "email")
	WebElement emailfieldkeys;
	
	@FindBy(name = "pass")
	WebElement passwfieldkeys;
	
	@FindBy(name = "login")
	WebElement sign;
	
	@FindBy(linkText = "Forgot Password?")
	WebElement forgot;

	//Step 2 second step- Page factory Constructor: Create same class constructor create overloading by 'WebDriver driver' as a argument
	public Home(WebDriver driver)
	{
		//this -> in java keyword used when we call global variable
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Step -3
	public void emailofinput(String email) 
	{
		//explicit Wait implementation
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("email")));
		
		emailfieldkeys.clear();
		emailfieldkeys.sendKeys(email);
	}
	
	public void passwrdofinput(String pass) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("pass")));
		
		passwfieldkeys.sendKeys(pass);
	}
	
	public void signingin() throws InterruptedException
	{
		sign.click();
		Thread.sleep(3000);
	}
	
	public void Forgot() {
		forgot.click();
	}

	
}
