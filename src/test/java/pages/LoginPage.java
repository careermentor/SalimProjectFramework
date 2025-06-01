package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilties.ReadPropertiesFile;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropertiesFile.readelementfile("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readelementfile("login_password_name"))).sendKeys(pass);
	}
	
	public void click_login() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropertiesFile.readelementfile("login_loginbttn_css"))).click();
	}
}
