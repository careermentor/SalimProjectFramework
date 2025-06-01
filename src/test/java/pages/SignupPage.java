package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utilties.ReadPropertiesFile;

public class SignupPage {
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_createnewaccount_bttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropertiesFile.readelementfile("login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstame(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readelementfile("signup_firstname_name"))).sendKeys(fname);
	}
	

	public void select_dob_day(String day) throws Exception
	{
		Select dob_day=new Select(driver.findElement(By.name(ReadPropertiesFile.readelementfile("signup_dob_day_name"))));
		dob_day.selectByVisibleText(day);
		
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readelementfile("login_password_name"))).sendKeys(pass);
	}
	

	public void click_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropertiesFile.readelementfile("signup_gender_male_xpath"))).click();
	}
	
	public void click_signup_bttn() throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readelementfile("signup_signupbttn_name"))).click();
	}
}
