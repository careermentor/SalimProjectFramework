package testcases;

import org.testng.annotations.Test;

import baseTest.InitiateBrowser;
import pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{
	
	@Test
	public void tc01_validate_valid_login_functionality() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_login();
	}

}
