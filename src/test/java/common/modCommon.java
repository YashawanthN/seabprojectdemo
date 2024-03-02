package common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.mod_pom;


public class modCommon {
	WebDriver driver;

	public modCommon(WebDriver driver) {
		this.driver = driver;
	}

	public modProjectsCommon viewModerationProject() throws IOException {
		mod_pom mod = new mod_pom(driver);
		mod.getModprojects();
		return new modProjectsCommon(driver);
	}
	
	/*
	 * public modCommon waitToVisibleElement() throws IOException { Waits exwait =
	 * new Waits(driver); exwait.explicitWait(); //return new modCommon(driver);
	 * return this; }
	 */
}
