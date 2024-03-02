package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.basefile;
import common.loginCommon;
import common.newProjectsCommon;

public class importTest extends basefile {

	@BeforeTest
	public void navigateToImport() throws IOException {
		loginCommon login = new loginCommon(driver);
		login.enterCredentials()
		.clickLoginButton()
		.ClickModerationService()
		.viewModerationProject().clickimportbutton();
	}
	
	//@Test
	public void downloadimportFiles()
	{
		newProjectsCommon npm = new newProjectsCommon(driver);
		npm.downloadExportTemplate();
	}
	//@Test(priority = 2, description = " Verify that project creation files are Selected for import ")

	public void importproject() throws IOException, InterruptedException {

		newProjectsCommon npm = new newProjectsCommon(driver);
		npm.uploadPaperInfo()
		.uploadPersonnelInfo()
		.uploadCandidateInfo();

	}

	//@Test(priority = 1, description = "verify the title of the import page")
	public void gettitleImport() throws IOException {

		newProjectsCommon npm = new newProjectsCommon(driver);
		npm.getimportPageTitle();

	}

	@Test( priority = 3, description = " Search the exam centre by code and confirm that exam centre presented")

	public void getexamcentrebycode() {
		newProjectsCommon npm = new newProjectsCommon(driver);
		npm.getViewExamcentres();
	}

}
