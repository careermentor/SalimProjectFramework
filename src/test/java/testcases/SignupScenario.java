package testcases;

import org.testng.annotations.Test;

import baseTest.InitiateBrowser;
import pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{
	
	@Test
	public void tc02_validate_signup_functionality() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccount_bttn();
		sign.enter_firstame("Saleem");
		sign.select_dob_day("17");
		sign.click_male();
		sign.click_signup_bttn();
		
	}

}
