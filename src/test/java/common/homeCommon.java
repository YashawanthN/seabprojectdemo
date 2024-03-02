package common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import Pages.home_pom;


public class homeCommon {
	
	WebDriver driver;
	public homeCommon(WebDriver driver){
		this.driver = driver;
	}
	
	public modCommon ClickModerationService() throws IOException
	{
		home_pom home = new home_pom(driver);
		home.getmodService();
		return new modCommon(driver);
		
	}

}
