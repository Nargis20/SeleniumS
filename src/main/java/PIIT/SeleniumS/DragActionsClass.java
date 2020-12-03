package PIIT.SeleniumS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// Drag And drop
		//iframe-> iframe is webpage inside the webpage
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		//executeAsyncScript(script, args), executeScript(script, args) for JavascriptExecutor
		
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		
		
		
		driver.close();
	}

}
