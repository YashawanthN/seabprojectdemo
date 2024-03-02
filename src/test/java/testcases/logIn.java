package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import base.basefile;
import common.loginCommon;
import utilities.readTestdata;

public class logIn extends basefile {

	@Test(dataProvider = "testDataSeab", dataProviderClass = readTestdata.class)
	public void loginWithValidCredentials(String email, String password) throws IOException, InterruptedException {
		loginCommon login = new loginCommon(driver);

		login.enterCredentials(email, password);
		login.clickLoginButton();
	}

}
