package common;

import org.openqa.selenium.WebDriver;

import Pages.NewProject_import_pom;


public class newProjectsCommon {
	WebDriver driver;

	public newProjectsCommon(WebDriver driver) {
		this.driver = driver;
	}
	
	public newProjectsCommon downloadExportTemplate()
	{
		/*
		 * downloadFile download = new downloadFile(); download.downloadfiles();
		 */
		NewProject_import_pom downloadTemplate = new NewProject_import_pom(driver);
		downloadTemplate.downloadExamcentreTemplate();
		return this;
	}
	public newProjectsCommon getimportPageTitle() {
		NewProject_import_pom importFile = new NewProject_import_pom(driver);
		importFile.gettitle();
		return this;
	}

	public newProjectsCommon uploadPaperInfo() throws InterruptedException {
		NewProject_import_pom importFile = new NewProject_import_pom(driver);
		importFile.getPaperInfo();
		return this;
	}

	public newProjectsCommon uploadPersonnelInfo() {
		NewProject_import_pom importPersonnel = new NewProject_import_pom(driver);
		importPersonnel.getPersonnelInfo();
		return this;

	}

	public newProjectsCommon uploadCandidateInfo() {
		NewProject_import_pom importCandidate = new NewProject_import_pom(driver);
		importCandidate.getCandidateInfo();
		return this;
	}
	
	public void  getViewExamcentres()
	{
		NewProject_import_pom viewExamcentres = new NewProject_import_pom(driver);
		viewExamcentres.viewExamCentre();
		viewExamcentres.searchExamcentrebyCode();
	}
}
