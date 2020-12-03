package Run;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import CodeForBrowser.OpenBrowsers;

public class Ilistners extends OpenBrowsers implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Automation is Passed");
		
		//Need This code for screen shoot
		this.driver = ((OpenBrowsers)result.getInstance()).driver;
		
		//Capture the system date & time
		Date date_time = new Date();
		System.out.println(date_time);
		
		String convert_date_time = date_time.toString().replace(" ", "_").replace(":", "_");
		System.out.println(convert_date_time);
		
		File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		try {
			FileHandler.copy(shots, new File("C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\ScreenShot\\Passed\\" + convert_date_time + ".png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Automation is Failed");
		
		//Need This code for screen shoot
		this.driver = ((OpenBrowsers)result.getInstance()).driver;
		
		//Capture the system date & time
		Date date_time = new Date();
		System.out.println(date_time);
		String convert_date_time = date_time.toString().replace(" ", "_").replace(":", "_");
		System.out.println(convert_date_time);
		
		File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(shots, new File("C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\ScreenShot\\Failed\\" + convert_date_time + ".png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

	@Override
	public void onStart(ITestContext context) {

		System.out.println("Automation is Started");
	}


}
