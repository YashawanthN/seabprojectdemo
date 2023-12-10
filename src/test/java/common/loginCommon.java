package common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


import Pages.login_pom;

public class loginCommon {

	WebDriver driver;
	
	public loginCommon(WebDriver driver) {
		this.driver = driver;
	}

	public loginCommon enterCredentials() throws IOException {
		login_pom log = new login_pom(driver);
		log.enterEmail();
		log.enterPass();
		return this;
	}

	public homeCommon clickLogoinButton()
	{
		login_pom log = new login_pom(driver);
		log.clickLogin();
		return new homeCommon(driver);
	}

}
