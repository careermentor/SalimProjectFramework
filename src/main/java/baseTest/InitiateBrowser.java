package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilties.ReadPropertiesFile;

public class InitiateBrowser {
	
	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws Exception {

		if (ReadPropertiesFile.readconfigfile("BrowserName").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (ReadPropertiesFile.readconfigfile("BrowserName").equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}

		else if (ReadPropertiesFile.readconfigfile("BrowserName").equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();

		}
		
		else 
		{
			driver = new EdgeDriver();
		}
		
		driver.get(ReadPropertiesFile.readconfigfile("ApplicationURL"));
		

	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}

}
