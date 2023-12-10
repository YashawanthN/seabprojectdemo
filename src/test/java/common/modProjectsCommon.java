package common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.ModProjects_pom;


public class modProjectsCommon {

	WebDriver driver;

	public modProjectsCommon(WebDriver driver) {
		this.driver = driver;

	}
	
	public newProjectsCommon clickimportbutton() throws IOException {
		ModProjects_pom modProjects = new ModProjects_pom(driver);
		modProjects.getimportbutton();
		return new newProjectsCommon(driver);
	}

}
