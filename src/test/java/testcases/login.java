package testcases;

import java.io.IOException;
import java.time.Duration;


import org.testng.annotations.Test;
import base.basefile;
import utilities.login_pom;

public class login extends basefile {
	
	login_pom login = new login_pom(driver);
	
	@Test(priority = 1)
	public void loginEo() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.Email(driver).sendKeys(C_Property.getProperty("eo"));
		//Thread.sleep(3000);
		login.Password(driver).sendKeys(C_Property.getProperty("eo_pass"));
		//Thread.sleep(3000);
		login.signin(driver).click();
		
	}

}
