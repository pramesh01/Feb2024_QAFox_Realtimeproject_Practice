package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class Two extends TestBase {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
	 driver=initializeBrowser("edge");	
		
	}
	
	@AfterMethod
	public void teardown() {
			driver.quit();
	}
	
	@Test
	public void two() {
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle()+" executing on edge browser");
	}
}
