package common;


import org.openqa.selenium.WebDriver;
import Pages.login_pom;
import utilities.Waits;


public class loginCommon {

	WebDriver driver;
	
	public loginCommon(WebDriver driver) {
		this.driver = driver;
	}
	public loginCommon enterCredentials(String email, String password){
		login_pom log = new login_pom(driver);

		log.enterEmail(email);
		log.enterPass(password);
		return this;
	}

	public homeCommon clickLoginButton() throws InterruptedException
	{
		login_pom log = new login_pom(driver);
		log.clickLogin();
		Waits.waitImplicit(driver, 60);
		return new homeCommon(driver);
	}

}
