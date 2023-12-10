package common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.mod_pom;

public class modCommon {
	WebDriver driver;

	public modCommon(WebDriver driver) {
		this.driver = driver;
	}

	public modProjectsCommon selectModerationProject() throws IOException {
		mod_pom mod = new mod_pom(driver);
		mod.getModprojects();
		return new modProjectsCommon(driver);
	}
}
