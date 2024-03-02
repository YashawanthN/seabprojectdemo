package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import base.basefile;
import common.loginCommon;

public class saveSchedules extends basefile {
	
	@Test
	public void navigateToImport() throws IOException {
		loginCommon login = new loginCommon(driver);
		login.enterCredentials()
		.clickLoginButton()
		.ClickModerationService()
		.viewModerationProject()
		.selectSetupInprogressProject();
	}

}
