package testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import base.basefile;
import common.implicitWaits;
import common.loginCommon;

public class importTest extends basefile {

	@Test(description = " Verify able to import the project ")
	
	public void importproject() throws IOException {
		implicitWaits  iWait = new implicitWaits(driver);
		iWait.waitImplicit();
		loginCommon login = new loginCommon(driver);
		login.enterCredentials()
		.clickLogoinButton()
		.ClickModerationService()
		.selectModerationProject()
		.clickimportbutton()
		.uploadPaperInfo()
		.uploadPersonnelInfo()
		.uploadCandidateInfo();
		
		
		
	}

}
