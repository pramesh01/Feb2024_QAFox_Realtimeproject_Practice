package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class Three extends TestBase{

	public WebDriver driver;
	@BeforeMethod
	public void setup() {
	 driver=initializeBrowser("firefox");		
	}
	@AfterMethod
	public void teardown() {
			driver.quit();
	}
	@Test
	public void three() {
		driver.get("https://www.tutorialsninja.com/demo/");
		System.out.println(driver.getTitle()+" executing on firefox browser");
	}
}
