package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {
	
	
	public WebDriver initializeBrowser(String bName) {
		WebDriver driver=null;
		DesiredCapabilities dc=new DesiredCapabilities();
		
		if(bName.equals("chrome")) {
		 dc.setBrowserName("chrome");	
			
		}
		else if(bName.equals("firefox")) {
			dc.setBrowserName("firefox");
			
		}
		else if(bName.equals("edge")) {
			dc.setBrowserName("MicrosoftEdge");
			
		}
		try {
			driver=new RemoteWebDriver(new URL("http://localhost:4444"),dc);
		} catch (Throwable e) {
			
		}
		 return driver;
	}

}
