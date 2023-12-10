package common;

import org.openqa.selenium.WebDriver;

import Pages.NewProject_import_pom;

public class newProjectsCommon {
	WebDriver driver;
	public newProjectsCommon(WebDriver driver) {
		this.driver = driver;
		
	}
	public newProjectsCommon uploadPaperInfo() {
		NewProject_import_pom importpaper = new NewProject_import_pom(driver);
		importpaper.getPaperInfo();
		return this;
		
		
	}
	public newProjectsCommon uploadPersonnelInfo() {
		NewProject_import_pom importpersonnel = new NewProject_import_pom(driver);
		//importpersonnel.getPersonnelInfo();
		return this;
	
		
	}
	public newProjectsCommon uploadCandidateInfo() {
		NewProject_import_pom importcandidate = new NewProject_import_pom(driver);
		//importcandidate.getCandidateInfo();
		return this;
		
		
	}
}
