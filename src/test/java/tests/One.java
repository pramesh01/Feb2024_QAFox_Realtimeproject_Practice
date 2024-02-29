package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class One extends TestBase {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	 driver=initializeBrowser("chrome");	
		
	}
	
	@AfterMethod
	public void teardown() {
			driver.quit();
	}
	
	@Test
	public void one() {
		
		driver.get("https://www.qtpselenium.com");
		System.out.println(driver.getTitle()+" executing on Chrome browser");
	}
}
