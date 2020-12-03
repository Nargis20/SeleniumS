package Pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_Password1 {
public WebDriver driver;
	
	@FindBy(id ="identify_email")
	WebElement search_forgot;
	
	@FindBy(name = "did_submit")
	WebElement search_submit;
	
	@FindBy(xpath = "(//*[text()='Find Your Account'])[2]")
	WebElement find_your_account;
	
	public Forgot_Password1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void find_an_account(String email)
	{
		search_forgot.sendKeys(email);
	}
	public void search_button() {
		search_submit.click();
	}
	
	public WebElement ForgotYourAccountText() throws InterruptedException
	{
		Thread.sleep(2000);
		return find_your_account;
	}
}
